package com.sample.aashish;

public class Test {
	public static void main(String[] args) {
		Product p = new Discount();
		
		//This triggers a product getAll method. 
		p.getAll();
		
		//testing method Overloading
		Product p1 = new Product();
		p1.updateProduct("Vegetables");
		p1.updateProduct(123L, "!G#$");
	}

}
