package com.sample.aashish;

public class Customer {
	private Integer customerId;
	private String name;
	private String address;
	private String password;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer customerId, String name, String address, String password) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.password = password;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", address=" + address + ", password="
				+ password + "]";
	}

	public static void main(String[] args) {
		//creating object using parameterized Constructor.
		Customer cus = new Customer(123, "Aashish","Kathmandu" , "Password");
		System.out.println(cus);
		
		//creating object using default constructor:
		Customer cus1 = new Customer();
		cus1.setCustomerId(321);
		cus1.setName("Aashika");
		cus1.setAddress("Nepal");
		cus1.setPassword("pass");
		System.out.println(cus1.toString());
	

	}

}
