package com.sample.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
//		Customer dbCustomerObject = customerRepo.getById(customer.getCustomerId());
//		if (dbCustomerObject.getCustomerId().equals(customer.getCustomerId())) {
//			System.out.println("Customer already existed");
//		} else {
//			customerRepo.save(customer);
//			System.out.println("Customers saved successfully");
//		}
		customerRepo.save(customer);

	}

	@Override
	public List<Customer> getCustomer() {
		List<Customer> getCustomer = customerRepo.findAll();
		List<Customer> finalList = new ArrayList<Customer>();

		boolean found = false;
		// checking whether the list contains any duplicates
		for (Customer cust : getCustomer) {
			for (Customer cust1 : finalList) {
				if (cust.getCustomerNumber().equals(cust1.getCustomerNumber())) {
					found = true;
					break;
				}
			}
			if (!found)
				finalList.add(cust);
		}

//		List<Customer> getCustomer2 = customerRepo.findAll();
//		Set<Customer> cus = new HashSet<>();
//		Set<Customer> uniqueRecords = getCustomer2.stream().filter(n->!cus.add(n)).collect(Collectors.toSet());

		List<Customer> getCustomer2 = customerRepo.findAll();
		Set<Customer> finalSet = getCustomer2.stream()
				.collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(Customer::getCustomerName))));

		List<Customer> listIsSorted = finalSet.stream().collect(Collectors.toList());

		return listIsSorted;

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
		customerRepo.deleteById(customerId);

	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepo.save(customer);
	}

}
