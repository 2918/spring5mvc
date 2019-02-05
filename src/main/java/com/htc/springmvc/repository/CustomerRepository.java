package com.htc.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.springmvc.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String>{

	
}
