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
			Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt, Discount discount) {
		super(id, desc, sKU, categoryId, inventoryId, price, dicountId, createdAt, modifiedAt, deletedAt, discount);
		// TODO Auto-generated constructor stub
	}

	public void getAll() {
		System.out.println("It is a discount");
	}
	

		
	}
	

