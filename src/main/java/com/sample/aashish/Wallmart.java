package com.sample.aashish;

public class Wallmart {
	
	 static double total ;
	 static int count;
	
	 
	 public Wallmart() {
		 total = 0.0;
		
		
	}
	 public void totalPrice(String[] itemName , Double[] itemPrice) {
		 double newTotal= 0.0;
		 for(int i = 0; i< itemPrice.length; i++) {
				 newTotal += itemPrice[i]; 
				 count++;
			 }
		 	total = newTotal;
		 }
		 
	 }
	 
	 

