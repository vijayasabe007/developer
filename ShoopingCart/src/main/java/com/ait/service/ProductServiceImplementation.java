package com.ait.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ait.dao.ProductDao;
import com.ait.model.Product;

@Service
public class ProductServiceImplementation implements ProductService
{
	@Autowired
	private ProductDao productdao;

	@Override
	public boolean insertProduct(Product p)
	{
		productdao.insertProduct(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p)
	{
		return productdao.deleteProduct(p);
	}

	@Override
	public boolean updateProduct(Product p)
	{
		productdao.updateProduct(p);
		return true;
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productdao.getAllProduct();
	}

	@Override
	public Product getProductById(int id)
	{
		return productdao.getProductById(id);
	}
	
	
}
