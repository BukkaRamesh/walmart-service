/**
 * 
 */
package com.sample.rameshpractise;

import java.lang.reflect.Constructor;

/**
 * @author rameshbukka
 *
 */
public class CCreation implements Cloneable{

	public CCreation() throws CloneNotSupportedException {
		super.clone();   // clone from constructor of a class object creation
		
	}
	
	
	String name = "ramesh";
	
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, CloneNotSupportedException {
		
		// ways to create object
		User u = new User();  // using new keyword
		User u1 = User.class.newInstance();  // using newInstance() method
		Constructor<?>[] u2 = User.class.getConstructors(); // using constructor method
		
		CCreation c = new CCreation();
		CCreation c1 = (CCreation) c.clone();
		
		
		int number = 12345678;
		
	//	int reverse = Integer.parseInt(new StringBuilder(number+ "").reverse());
				
		
		
		
		
	}

}
