/**
 * 
 */
package com.sample.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.hibernate.criterion.Distinct;
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
		List<Customer> allcustomerList=new ArrayList<Customer>(customerRepo.findAll());
		boolean exist=false;
	 for (Customer customer2 : allcustomerList) 
	 {
		if(customer2.getCustomerName().equals(customer.getCustomerName())) 
		{
			exist=true;
		}
	 }
	    if (exist=false) {
		customerRepo.save(customer);
		}else {
			System.out.println("Customer already exist");
		}
		
	}
	
     @Override
	    public List<Customer> getAllCustomers() {

		return customerRepo.findAll();
	      }

	 
    private Object toCollection(Object object) {
	// TODO Auto-generated method stub
	return null;
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


	@Override
	public Customer updateUserById(Long id, Customer user) {
		// TODO Auto-generated method stub
		
		return customerRepo.save(user);
	}
	
	@Override
	public List<Customer> getUniqueCustomers() {
		// TODO Auto-generated method stub
		List<Customer> allcustomerobj=new ArrayList<Customer>(customerRepo.findAll());
		List<Customer> uniquecustomerobj=new ArrayList<Customer>();
		
	

		//1st method
		List<Customer> allcustomerobj1=new ArrayList<Customer>(customerRepo.findAll());
		List <Customer> uniqueCustomerList = allcustomerobj1.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Customer:: getCustomerName))),
                        ArrayList::new));
		
		System.out.println("java 8 feature to get unique value"+uniqueCustomerList.size());
		
		//2nd method
		for(Customer obj1:allcustomerobj) 
		 {
			//System.out.println("obj1 value"+obj1.getCustomerName());
			boolean value=true;
			for (Customer obj2 : uniquecustomerobj) 
			{
				//System.out.println("obj2 value"+obj1.getCustomerName());
				if(obj2.getCustomerName().equals(obj1.getCustomerName()))
				 {
					value=false;
				 }
			}
		 
			if (value==true)
			{
				uniquecustomerobj.add(obj1);	
			}
		 
		 }		
		
		for (Customer obj2 : uniquecustomerobj) 
		{
			System.out.println("unique Records"+obj2.getCustomerName());
		}
		
		
		
		
		
		
		
		
		
		return uniquecustomerobj;
	}


	
	

}

