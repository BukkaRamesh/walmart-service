/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Product {
//	1. Create a class Product with variables as id, name, desc, SKU, categoryId, inventoryId, price, discountId, createdAt, modifiedAt, deletedAt and generate getter, setter methods and constrcutor with all parameters
//
//	2. Create main method and 2 objects for the product and set data using set methods and perform relational, logical and decision making i.e., (==, !=, <, >, <=, >= )  (&&, ||) use if else and for
//

	private final Integer id;
	private String name;
	private String desc;
	private final String SKU;
	private String categoryId;
	private String inventoryId;
	private double price;
	private Integer discountId;
	private String createdAt;
	private String modifiedAt;
	private String deletedAt;
	
	public Product(Integer id,String name,String desc,String SKU,String categoryId,String inventoryId,double price,Integer discountId,String createdAt,String modifiedAt,String deletedAt) 
	{
		this.id=id;
		this.name=name;
		this.desc=desc;
		this.SKU=SKU;
		this.categoryId=categoryId;
		this.inventoryId=inventoryId;
		this.price=price;
		this.discountId=discountId;
		this.createdAt=createdAt;
		this.modifiedAt=modifiedAt;
		this.deletedAt=deletedAt;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(String inventoryId) {
		this.inventoryId = inventoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Integer discountId) {
		this.discountId = discountId;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public String getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(String modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	public String getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Integer getId() {
		return id;
	}

	public String getSKU() {
		return SKU;
	}

	
	
	public static void main(String[] args) 
	{
		//                        id,   name,       desc,                       SKU,     categoryId, inventoryId, price, discountId, createdAt, modifiedAt, deletedAt
		Product obj1= new Product(001,"Toyota","car with great value milage ","987654321","car_123","inven_123",40000.00,456789,"02/19/2020","02/19/2021","02/19/2022"); 
    	Product obj2= new Product(002,"Accord","car with great value milage ","123456789","car_123","inven_123",50000.00,4567899,"03/29/2020","03/29/2021","03/29/2022"); 
		
    	//1
    	
    	if(obj1.categoryId==obj2.categoryId)
    	{
    		if(obj1.SKU!=obj2.SKU) 
    		{
    			System.out.println("Both are cars but are of different companies");
    		}else 
    		{
    			System.out.println("Both are same cars ");	
    		}
    	}else 
    	{
    	System.out.println("these are two different products");	
    	}
    	
    	
    	//2
    	
    	if(obj1.categoryId==obj2.categoryId)
    	{
    		if(obj1.price<obj2.price) 
    		{
    			System.out.println(obj1.name+ " has lower price");
    		}else 
    		{
    			System.out.println(obj2.name+ " has lower price");	
    		}
    	}else 
    	{
    	System.out.println("these are two different products");	
    	}
    	
    	//3
    	
    	if((obj1.categoryId==obj2.categoryId)&&(obj1.SKU!=obj2.SKU))
    	{
    		System.out.println("Both are same cars ");
    	}else 
    		{
    			System.out.println("Both are different cars ");	
    		}
    	
	
    	
    	
	}
}
