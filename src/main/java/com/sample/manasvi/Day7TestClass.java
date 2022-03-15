/**
 * 
 */
package com.sample.manasvi;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author manasvibhardwaj
 *
 */
public class Day7TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//OOP
		Day7ProductClass obj = new Day7DiscountClass();
		 obj.getAll();//Result:-"This is DiscountClass"
		 
	    
		 // call for method Overriding
		obj.updateProduct();//Result:-"This is DiscountClass Method Overriding"
	
	    
		// multiple inheritance is not possible it gives Syntax error
		
		
		//Aggregation (Has-A) relationship between Day7ProductClass and Day7DiscountClass

		Day7ProductClass objProductClass=new Day7ProductClass(11,"PApple","Pdescription-Watch is fast");
		objProductClass.printValueProductCass();
		Day7DiscountClass objDiscountClass=new Day7DiscountClass(1,"AppleWatch","Product is fast",objProductClass);
		                               //Integer id, String name,String description, Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt,Day7ProductClass object

		objDiscountClass.printValueDiscountCass();
		
		
	}

}
