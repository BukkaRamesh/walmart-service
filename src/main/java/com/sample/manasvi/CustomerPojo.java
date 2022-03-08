/**
 * 
 */
package com.sample.manasvi;

import org.yaml.snakeyaml.constructor.Construct;

/**
 * @author manasvibhardwaj
 *
 */
public class CustomerPojo {
	
	public CustomerPojo() {
		
		System.out.println("constructor call");
	}

	private Integer Id; // can be access only by getter and setter method outside the class
	public String FirstNama;
	public String LastNama;
	public String Street;
	public String PostalCode;
	public String City;
	
	
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getFirstNama() {
		return FirstNama;
	}
	public void setFirstNama(String firstNama) {
		FirstNama = firstNama;
	}
	public String getLastNama() {
		return LastNama;
	}
	public void setLastNama(String lastNama) {
		LastNama = lastNama;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

}
