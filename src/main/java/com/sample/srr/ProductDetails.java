/**
 * 
 */
package com.sample.srr;

import java.sql.Date;

//

public class ProductDetails {

	/*Create a class Product with variables as id, name, desc, SKU, 
	 * categoryId, inventoryId, price, discountId, createdAt, modifiedAt, 
	 * deletedAt and generate getter, setter methods and constructor with all parameters
	 * Test.....................
	 */
	private long Id;
	private String Name;
	private String Description;
	private String SKU;
	private long CategoryId;
	private long InventoryId;
	private double Price;
	private long DicountId;
	private String CreatedDt;
	private String ModifiedAt;
	private String DeletedAt;
	
	//Constructor below- ProductDetails 
	public ProductDetails(long Id,  String Name, String Description, String SKU, long CategoryId, long InventoryId, double Price, long DicountId, String CreatedDt,
			String ModifiedAt, String DeletedAt ) {
		this.Id = Id;
		this.Name = Name;
		this.Description = Description;
		this.SKU = SKU;
		this.CategoryId = CategoryId;
		this.InventoryId = InventoryId;
		this.Price = Price;
		this.DicountId = DicountId;
	    this.CreatedDt = CreatedDt;
	    this.ModifiedAt = ModifiedAt;
	    this.DeletedAt = DeletedAt;
	    	    	
	}


	public long getId() {
		return Id;
	}



	public void setId(int id) {
		Id = id;
	}



	public String getDescription() {
		return Description;
	}



	public void setDescription(String description) {
		Description = description;
	}



	public String getSKU() {
		return SKU;
	}



	public void setSKU(String sKU) {
		SKU = sKU;
	}



	public long getCategoryId() {
		return CategoryId;
	}



	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}



	public long getInventoryId() {
		return InventoryId;
	}



	public void setInventoryId(int inventoryId) {
		InventoryId = inventoryId;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public long getDicountId() {
		return DicountId;
	}



	public void setDicountId(int dicountId) {
		DicountId = dicountId;
	}



	public String getCreatedDt() {
		return CreatedDt;
	}



	public void setCreatedDt(String createdDt) {
		CreatedDt = createdDt;
	}



	public String getModifiedAt() {
		return ModifiedAt;
	}



	public void setModifiedAt(String modifiedAt) {
		ModifiedAt = modifiedAt;
	}



	public String getDeletedAt() {
		return DeletedAt;
	}



	public void setDeletedAt(String deletedAt) {
		DeletedAt = deletedAt;
	}

	public String getName() {
		return DeletedAt;
	}


	public void setName(String name) {
		Name = name;
	}



	public static void main(String[] args) {
		/*Create main method and 2 objects for the product and set data using set methods and perform relational, 
		logical and decision making i.e., (==, !=, <, >, <=, >= )  (&&, ||) use if else and for
 */
		
		ProductDetails P1 = new ProductDetails(1001, "Dell12", "Dell", "1034", 1001, 1234, 1234.34, 101,"2021-03-09", "2021-03-11", "2022-03-11");
		System.out.println(P1);
		
		ProductDetails P2= new ProductDetails(1002, "HP20", "HP", "1034", 1001, 1234, 1234.34, 101, "2021-04-09", "2021-04-11", "2022-04-11");
		System.out.println(P2);
		//output results are not coming for P1 and P2
			    		
    		if(P1.getName()== P2.getName()) {
    			System.out.println("It is the same Item");
    		}else if(P1.getCreatedDt()!= P2.getCreatedDt()){
    			System.out.println("It's not created on Same date");

    		}else {
    			System.out.println(" It is not the same Item");
    		}
    		
    	}


	}
