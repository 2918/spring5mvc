package com.htc.springmvc.to;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class CustomerTO {

	@NotEmpty(message="Customer ID Mandatory")
	private String customerId;
	
	@NotEmpty(message="Customer Name Mandatory")
	private String customerName;
	
	@NotEmpty(message="Occupation is mandatory")
	private String occupation;

	@NotEmpty(message="Qualification is mandatory")
	private String qualification;
	
	private int addressId;
	
	@NotEmpty(message="Doorno is mandatory")
	private String doorno;
	
	@NotEmpty(message="Street is mandatory")
	private String street;
	
	@NotEmpty(message="City is mandatory")
	private String city;
	
	//@NotEmpty(message="Pincode is mandatory")
	@Pattern(regexp="[0-9]{5}", message="Invalid pincode")
	private String pincode;
	
	public CustomerTO(){
	}

	public CustomerTO(@NotEmpty(message = "Customer ID Mandatory") String customerId,
			@NotEmpty(message = "Customer Name Mandatory") String customerName,
			@NotEmpty(message = "Occupation is mandatory") String occupation,
			@NotEmpty(message = "Qualification is mandatory") String qualification,
			@NotEmpty(message = "Doorno is mandatory") String doorno,
			@NotEmpty(message = "Street is mandatory") String street,
			@NotEmpty(message = "City is mandatory") String city,
			@Pattern(regexp = "[0-9]{5}", message = "Invalid pincode") String pincode) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.occupation = occupation;
		this.qualification = qualification;
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
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


	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getDoorno() {
		return doorno;
	}


	public void setDoorno(String doorno) {
		this.doorno = doorno;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "CustomerTO [customerId=" + customerId + ", customerName=" + customerName + ", occupation=" + occupation
				+ ", qualification=" + qualification +  ", doorno=" + doorno + ", street="
				+ street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	
}
