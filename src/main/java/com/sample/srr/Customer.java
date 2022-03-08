package com.sample.srr;

public class Customer {

	public Integer customerId;
	public String name;
	public String address;
	private String password;
	
	
	public void setAddress(String address) {
		this.address= address;
	}
	public String getAddress() {
		return address;
	}
	public Customer() {
		//default Constructor
	}
	public Customer(Integer customerId, String name, String address) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		//Parameterized Constructor
	}
	public static void main(String[] args) {
		//Main method
		Customer c = new Customer();
	c.setAddress("DC");
	System.out.println(c.getAddress());
		
	}
		
	}

