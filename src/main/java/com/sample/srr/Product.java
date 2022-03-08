package com.sample.srr;

public class Product {
	public  Integer productId;
	public String productName;
	public Integer productPrice;
	
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
			}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public  void Product(Integer productId, String productName, Integer productPrice) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
				
		
	}
	public static void main(String[] args) {
		//Main method
				System.out.println("hello");
				Product p = new Product();
				p.setProductId(101);
				p.setProductName("Laptop");
				System.out.println("ProductID"  + p.productId + "ProductName" +  p.productName);
	}
}	

