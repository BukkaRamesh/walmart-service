/**
 * 
 */
package com.sample.service;

import java.util.List;
import java.util.Set;

import com.sample.model.Customer;

/**
 * @author manasvibhardwaj
 *
 */
public interface CustomerService {
	public void saveCustomer(Customer customer);

	public List<Customer> getAllCustomers();

	public Customer findByCustomerId(Long customerId);

	public Customer getByCustomerName(String customerName);

	public void deleteCustomerById(Long customerId);

	public Customer updateUserById(Long id, Customer user);

	


}
