package com.suren.rentcloud.profileservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suren.rentcloud.commons.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
