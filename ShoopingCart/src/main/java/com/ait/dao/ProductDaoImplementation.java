package com.ait.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ait.model.Product;

@Transactional
@Repository
public class ProductDaoImplementation implements ProductDao
{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public boolean insertProduct(Product p) 
	{
		sessionfactory.getCurrentSession().saveOrUpdate(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) 
	{
		sessionfactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public boolean updateProduct(Product p)
	{
		sessionfactory.getCurrentSession().update(p);
		return true;
	}

	@Override
	public List<Product> getAllProduct() 
	{
		Query<Product> q=sessionfactory.getCurrentSession().createQuery("from Product");
		List<Product> productlist=q.list();
		return productlist;
	}

	@Override
	public Product getProductById(int id) 
	{
		return sessionfactory.getCurrentSession().get(Product.class,id);
	}

}
