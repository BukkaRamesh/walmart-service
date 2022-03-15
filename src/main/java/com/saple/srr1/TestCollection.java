package com.saple.srr1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.saple.srr1.Category;
import com.saple.srr1.Product;


public class TestCollection {
	
	public static void main(String [] args) {
		
		Category category = new Category (1L, "Mobile", "Product under Mobiel");
				
				Product p1 = new Product(1L, "Iphone", category);
	
				p1.printProduct();
				
	List<Product> productList = new ArrayList<Product>();
	List product = new ArrayList();
	product.add("Iphone");
     product.add("Tab");
     product.add("Apple");
     product.add("Book");
     
     
 	List product1 = new LinkedList();
 	product1.add("Iphone1");
      product1.add("Tab1");
      product1.add("Apple1");
      product1.add("Book1");
      
     Collections.sort(product);
     
     
     for (Object object : product ) {
    	 System.out.println(object.toString());
     }
     
     
     
     for (int i = 0 ; i<product.size () ; i ++ ) {
    	 
    	 System.out.println(product.get(i));
    	 System.out.println(product1.get(i));
     }
     
   //Advance for loop - foreach
     
    
	
				
				
	}

}
