package com.sample.service;

import java.util.List;

import com.sample.model.Customer;

public interface CustomerService {

	public void saveCustomer(Customer customer);

	public List<Customer> getCustomer();

	public Customer getByCustomerName(String customerName);

	public Customer findByCustomerId(Long customerId);

	public void deleteCustomerById(Long customerId);

	public Customer updateCustomer(Customer customer);

}
