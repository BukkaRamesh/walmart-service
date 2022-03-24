/**
 * 
 */
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.model.Customer;
import com.sample.service.CustomerService;


/**
 * @author manasvibhardwaj
 *
 */
@RestController
@RequestMapping("walmart-service")
public class CustomerConrtoller {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer customer) {
		customerService.saveCustomer(customer);
		return customer;
	}
	
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
	
	}
	
	@GetMapping("/getUniqueCustomers")
	public List<Customer> getUniqueCustomers(){
		return customerService.getUniqueCustomers();
	
	}
	
	//@PutMapping   
	//@DeleteMapping 
	
	@GetMapping("/{customerId}")
	public Customer getById(@PathVariable Long customerId) {
		return customerService.findByCustomerId(customerId);
	}
	
	@GetMapping("/name/{customerName}")
	public Customer getByCustomerName(@PathVariable String customerName) {
		return customerService.getByCustomerName(customerName);
	}
	
	
	@GetMapping()
	public Customer getByName(@RequestParam("customerName") String customerName) {
		return customerService.getByCustomerName(customerName);
	}
    
	@DeleteMapping("/delete/{customerId}")
	public void deleteCustomerByID(@PathVariable Long customerId) {
		customerService.deleteCustomerById(customerId);
		}
	
	
	
	@PutMapping("/update/{id}")
	  public Customer updateUser(@PathVariable Long id, @RequestBody Customer user) {

              return customerService.updateUserById(id, user);
	    }

}
