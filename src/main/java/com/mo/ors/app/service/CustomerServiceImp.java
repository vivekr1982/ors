package com.mo.ors.app.service;

import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mo.ors.app.dao.CustomerDao;
import com.mo.ors.app.exception.AuthenticationFailedException;
import com.mo.ors.app.model.Customer;
import com.mo.ors.app.util.ShaHashing;

@Service
@Transactional
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerDao customerDao;
	
	@Override
	public Customer authentication(String username, String password) 
			throws NoSuchAlgorithmException, AuthenticationFailedException {
		Customer customer = customerDao.findBy(username);
		if(customer.getPassword().equals(ShaHashing.encrypted(password)))
			return customer;
		else
			throw new AuthenticationFailedException();
	}

	@Override
	public Long addCustomer(Customer customer) throws NoSuchAlgorithmException {
		customer.setPassword(ShaHashing.encrypted(customer.getPassword()));
		return customerDao.save(customer);
	}

}