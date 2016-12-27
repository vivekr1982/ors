package com.mo.ors.app.service;

import java.security.NoSuchAlgorithmException;

import com.mo.ors.app.exception.AuthenticationFailedException;
import com.mo.ors.app.model.Customer;

public interface CustomerService {

	Customer authentication(String username, String password)
			throws NoSuchAlgorithmException, AuthenticationFailedException;
	Long addCustomer(Customer customer) throws NoSuchAlgorithmException;
}
