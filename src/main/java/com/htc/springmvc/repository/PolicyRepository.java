package com.htc.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.springmvc.model.Policy;

public interface PolicyRepository extends JpaRepository<Policy, Integer>{
	
}
