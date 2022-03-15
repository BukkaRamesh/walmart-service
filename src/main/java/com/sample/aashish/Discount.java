package com.sample.aashish;

import java.sql.Timestamp;

public class Discount extends Product{
	private Long id;
	private String name;
	private String description;
	private float discountPercent;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;
	
	
	
	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Discount(Long id, String desc, String sKU, String categoryId, Long inventoryId, double price, Long dicountId,
			Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt) {
		super(id, desc, sKU, categoryId, inventoryId, price, dicountId, createdAt, modifiedAt, deletedAt);
		// TODO Auto-generated constructor stub
	}



	public Discount(Long id, String desc, String sKU, String categoryId, Long inventoryId, double price, Long dicountId,
			Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt, Long id2, String name, String description,
			float discountPercent, Timestamp createdAt2, Timestamp modifiedAt2, Timestamp deletedAt2) {
		super(id, desc, sKU, categoryId, inventoryId, price, dicountId, createdAt, modifiedAt, deletedAt);
		id = id2;
		this.name = name;
		this.description = description;
		this.discountPercent = discountPercent;
		createdAt = createdAt2;
		modifiedAt = modifiedAt2;
		deletedAt = deletedAt2;
	}
	public void getAll() {
		System.out.println("It is a discount");
	}
	

}
