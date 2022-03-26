/**
 * 
 */
package com.sample.controller;

import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.WalmartServiceApplication;
import com.sample.model.Customer;
import com.sample.model.Mail;
import com.sample.service.CustomerService;
import com.sample.service.EmailService;

import ch.qos.logback.core.Context;


/**
 * @author manasvibhardwaj
 *
 */
@RestController
@RequestMapping("walmart-service")
public class CustomerConrtoller {
	@Autowired
	CustomerService customerService;
	
	@Autowired
	EmailService emailService;
	
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
     
	
	@GetMapping("/sendEmail")
	public void sendEmail()throws MessagingException, IOException {
		Mail mail = new Mail();
        mail.setMailFrom("manasvibhardwaj@gmail.com");
        mail.setMailTo("manasvibhardwaj@gmail.com");
        mail.setMailSubject("Spring Boot - Email Example");
        mail.setMailContent("Learn How to send Email using Spring Boot!!!");
       
      
        emailService.sendEmail(mail);
		
		
		
		
	}
}
