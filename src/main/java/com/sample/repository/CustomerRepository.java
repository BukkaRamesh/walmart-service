
package com.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.model.Customer;


//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.example.model.Customer;


/**
 * @author manasvibhardwaj
 *
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	public Customer getByCustomerName(String customerName);

	public Customer findByCustomerId(Long customerId);

}