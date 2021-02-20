package com.suren.rentcloud.profileservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suren.rentcloud.commons.model.Customer;
import com.suren.rentcloud.profileservice.service.CustomerService;



@RestController
@RequestMapping(value = "/services")
public class ProfileController {
	
	@Autowired
	CustomerService cs;
	
	@RequestMapping(value = "/profile", method = RequestMethod.POST)
	public Customer custsave(@RequestBody Customer cust) {
		return cs.savecustomer(cust);
	}
}
