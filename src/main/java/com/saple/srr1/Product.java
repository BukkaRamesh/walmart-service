package com.saple.srr1;

import java.security.Timestamp;

public class Product {
	protected  Long Id;
	public String Name;
	private String description;
	public Long categoryId;
	public Long inventoryId;
	public Double price;
	public Long discountId;
	public Timestamp createdAt1;
	public Timestamp modifiedAt1;
	public Timestamp deletedAt1;
	
	
	
	public Category category; //calling category object here
	
	public Product (Long id, String name, Category category) {
		this.categoryId =id;
		this.Name = name;
		this.category = category; 
	}
	
	public void printProduct() {
		System.out.println(Id + Name + getCategory());
	}
		


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getDiscountId() {
		return discountId;
	}

	public void setDiscountId(Long discountId) {
		this.discountId = discountId;
	}

	public Timestamp getCreatedAt1() {
		return createdAt1;
	}

	public void setCreatedAt1(Timestamp createdAt1) {
		this.createdAt1 = createdAt1;
	}

	public Timestamp getModifiedAt1() {
		return modifiedAt1;
	}

	public void setModifiedAt1(Timestamp modifiedAt1) {
		this.modifiedAt1 = modifiedAt1;
	}

	public Timestamp getDeletedAt1() {
		return deletedAt1;
	}

	public void setDeletedAt1(Timestamp deletedAt1) {
		this.deletedAt1 = deletedAt1;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	public static void main(String[] args) {
		
				System.out.println("hello");
				
	}

	public Product(Long productId, String productName, String description, Long categoryId,
			Long inventoryId, Double price, Long discountId, Timestamp createdAt, Timestamp modifiedAt,
			Timestamp deletedAt) {
		super();
		this.Id = productId;
		this.Name = productName;
		this.description = description;
		this.categoryId = categoryId;
		this.inventoryId = inventoryId;
		this.price = price;
		this.discountId = discountId;
		this.createdAt1 = createdAt;
		this.modifiedAt1 = modifiedAt;
		this.deletedAt1 = deletedAt;
	}
		
}	

