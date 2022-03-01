package com.ait.service;

import java.util.List;

import com.ait.model.Product;

public interface ProductService
{
	boolean insertProduct(Product p);
	boolean deleteProduct(Product p);
	boolean updateProduct(Product p);
	List<Product>getAllProduct();
	Product getProductById(int id);
}
