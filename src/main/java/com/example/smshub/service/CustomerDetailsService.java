package com.example.smshub.service;

import java.util.List;

import com.example.smshub.model.CustomerDetails;

public interface CustomerDetailsService {
	
	List<CustomerDetails> findAllCustomers();	
	List<CustomerDetails> findAllSuppliers();
	
} 
