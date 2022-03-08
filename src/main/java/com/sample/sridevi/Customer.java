package com.sample.sridevi;

public class Customer {
	
	
	public Integer customerId;
	public String name;
	public String address;
	private String password;
	
	
    public Customer() {
		
	}
    public Customer(Integer customerId, String name) {
    	this.customerId = customerId;
    	this.name = name;
    }
	
    public void setCustomerId(Integer customerId) {
    	this.customerId = customerId;
    }
    
    public Integer getCustomerId() {
    	return customerId;
    
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    	
    }



    public static void main(String[]args) {
    	Customer c = new Customer();
    	c.setAddress("MI");
    	System.out.println(c.getAddress());
    	
        	
    	
    }
    	
    }
