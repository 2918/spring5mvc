package com.htc.springmvc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@Column(name="CUSTOMERID")
	private String customerId;
	
	@Column(name="CUSTOMERNAME")
	private String customerName;
	
	@Column(name="OCCUPATION")
	private String occupation;
	
	@Column(name="QUALIFICATION")
	private String qualification;
	
	@OneToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE}, mappedBy="customer")
	Address address;
	
	@Transient
	Set<Policy> policies = new HashSet<Policy>();

	public Customer(){
	}

	public Customer(String customerId, String customerName, String occupation, String job) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.occupation = occupation;
		this.qualification = job;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Policy> getPolicies() {
		return policies;
	}

	public void setPolicies(Set<Policy> policies) {
		this.policies = policies;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", occupation=" + occupation
				+ ", qualification=" + qualification + ", address=" + address + ", policies=" + policies + "]";
	}
	
}
