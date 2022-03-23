package com.sample.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.model.Customer;
import com.sample.repository.CustomerRepo;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepo customerRepo;

	@Override
	public void saveCustomer(Customer customer) {
		Customer dbCustomerObject = customerRepo.getById(customer.getCustomerId());
		if (dbCustomerObject.getCustomerId().equals(customer.getCustomerId())) {
			System.out.println("Customer already existed");
		} else {
			customerRepo.save(customer);
			System.out.println("Customers saved successfully");
		}

	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> getCustomer = new ArrayList<Customer>();
		getCustomer.addAll(customerRepo.findAll());

		Set<Customer> validCustomer = new HashSet<Customer>(getCustomer);

		return (List<Customer>) validCustomer;
	}

	@Override
	public Customer getByCustomerName(String customerName) {

		return customerRepo.getByCustomerName(customerName);
	}

	@Override
	public Customer findByCustomerId(Long customerId) {

		return customerRepo.findByCustomerId(customerId);
	}

	@Override
	public void deleteCustomerById(Long customerId) {
		Customer cos = customerRepo.getOne(customerId);
		customerRepo.delete(cos);

	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

}
