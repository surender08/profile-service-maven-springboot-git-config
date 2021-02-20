package com.suren.rentcloud.profileservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suren.rentcloud.commons.model.Customer;
import com.suren.rentcloud.profileservice.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerReposity;
	
	@Override
	public Customer savecustomer(Customer cust) {
		// TODO Auto-generated method stub
		return customerReposity.save(cust);
	}
	
}
