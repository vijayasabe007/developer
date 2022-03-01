package com.ait.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ait.model.Product;
import com.ait.model.UserInfo;
import com.ait.model.Role;

@Transactional
@Repository
public class UserDaoImplementation implements userDao
{
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public boolean insertUser(UserInfo u) 
	{
		System.out.println("**************" + u);

		Role r = sessionfactory.getCurrentSession().find(Role.class, 2);
		u.setRole(r);
		sessionfactory.getCurrentSession().save(u);
		return true;

	}

	@Override
	public List<UserInfo> getAllUsers() 
	{
		Query<UserInfo> q=sessionfactory.getCurrentSession().createQuery("from UserInfo");
		List<UserInfo> userlist=q.list();
		return userlist;
	}

	@Override
	public boolean deleteUserById(int uid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(UserInfo u) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public UserInfo getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getUserByNameAndPassword(String name, String password) {
		String query = "from UserInfo u where username=:n and password=:p";
		Query  q = sessionfactory.getCurrentSession().createQuery(query);
		q.setParameter("n", name);
		q.setParameter("p", password);
		q.setMaxResults(1);
		UserInfo u = (UserInfo) q.uniqueResult();

		return u;
	}
	
}
