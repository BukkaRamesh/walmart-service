package com.sample.srr;

public interface ProductService {

	//Interface is going to achieve Abstract mechanism
	//4 features
	//Create update fin delete
	public Product createProduct(Product product);
	
	public Product updateProduct(Product product);
	
	public Product findProduct(String Id);
	
	public Product deleteProduct(String Id);
		
	
}
