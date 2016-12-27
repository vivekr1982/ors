package com.mo.ors.app.service;

import java.util.List;

import com.mo.ors.app.exception.ProductNotFoundException;
import com.mo.ors.app.model.Product;

public interface ProductService {

	Product findBy(Long idProduct) throws ProductNotFoundException;
	Product findBy(String description) throws ProductNotFoundException;
	List<Product> findByCategory(String category) throws ProductNotFoundException;
	List<Product> findAll() throws ProductNotFoundException;
	
}
