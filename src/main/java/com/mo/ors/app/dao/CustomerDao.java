package com.mo.ors.app.dao;

import com.mo.ors.app.model.Customer;

public interface CustomerDao {

	Customer findBy(String username);
	Long save(Customer customer);
	
}
