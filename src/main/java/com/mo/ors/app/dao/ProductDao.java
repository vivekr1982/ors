package com.mo.ors.app.dao;

import java.util.List;

import com.mo.ors.app.model.Product;

public interface ProductDao {

	Product findBy(Long idProduct);
	Product findBy(String description);
	List<Product> findByCategory(String category);
	List<Product> findAll();
	
}
