package com.htc.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htc.springmvc.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, String>{

}
