/**
 * 
 */
package com.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.Customer;
import com.sample.repository.CustomerRepository;

/**
 * @author manasvibhardwaj
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{
	
	
	@Autowired
	CustomerRepository customerRepo;
	

	@Override
	public void saveCustomer(Customer customer) {
		customerRepo.save(customer);
		
	}


	@Override
	public List<Customer> getAllCustomers() {
		return customerRepo.findAll();
	}


	@Override
	public Customer findByCustomerId(Long customerId) {
		return customerRepo.findByCustomerId(customerId);
	}


	@Override
	public Customer getByCustomerName(String customerName) {
		return customerRepo.getByCustomerName(customerName);
	}


	@Override
	public void deleteCustomerById(Long customerId) {
		
		 customerRepo.deleteById(customerId);
	}

}

