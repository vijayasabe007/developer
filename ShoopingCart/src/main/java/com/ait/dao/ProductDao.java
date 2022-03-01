package com.ait.dao;

import java.util.List;


import com.ait.model.Product;

public interface ProductDao 
{
	boolean insertProduct(Product p);
	boolean deleteProduct(Product p);
	boolean updateProduct(Product p);
	List<Product>getAllProduct();
	Product getProductById(int id);
}
