package com.ait.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.dao.userDao;
import com.ait.model.UserInfo;

@Service
public class UserServiceImplementation implements UserService 
{
	@Autowired
	private userDao userdao;

	@Override
	public boolean insertUser(UserInfo u) {
		// TODO Auto-generated method stub
		userdao.insertUser(u);
		return true;
				
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
	public List<UserInfo> getAllUsers() {
		
		return userdao.getAllUsers();
	}

	@Override
	public UserInfo getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getUserByNameAndPassword(String name, String password) {
		UserInfo u=userdao.getUserByNameAndPassword(name, password);
		return u;
	} 

		
}
