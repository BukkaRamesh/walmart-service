package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Customer;
import com.sample.service.CustomerService;

@RestController
@RequestMapping("walmart-service")
public class CustomerController {
	
	@Autowired    //you need to create CustomerService object so that you can access the CustomerService methods. 
	CustomerService customerServ;
	
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerServ.saveCustomer(customer);
		return customer;
	}
	
	@GetMapping("/getCustomer")
	public List<Customer> getCustomer(){
		return customerServ.getCustomer();
	}
	
	@GetMapping("/name/{customerName}")
	public Customer getByCustomerName(@PathVariable String customerName) {
		return customerServ.getByCustomerName(customerName);
	}
	
	@GetMapping("/{customerId}")
	public Customer getById(@PathVariable Long customerId) {
		return customerServ.findByCustomerId(customerId);
	}
	
	@PutMapping("/saveCustomer")
	public Customer updateCustomer(@RequestBody Customer customer) {
		return customerServ.updateCustomer(customer);
		
	}
	@DeleteMapping("/delete/{customerId}")
	public void deleteById(@PathVariable Long customerId) {
		customerServ.deleteCustomerById(customerId);
	}

}
