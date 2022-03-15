package com.sample.aashish;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private Long id;
	private String desc;
	private String SKU;
	private String categoryId;
	private Long inventoryId;
	private double price;
	private Long dicountId;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;
	public Product(Long id, String desc, String sKU, String categoryId, Long inventoryId, double price, Long dicountId,
			Timestamp createdAt, Timestamp modifiedAt, Timestamp deletedAt) {
		super();
		this.id = id;
		this.desc = desc;
		SKU = sKU;
		this.categoryId = categoryId;
		this.inventoryId = inventoryId;
		this.price = price;
		this.dicountId = dicountId;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.deletedAt = deletedAt;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getSKU() {
		return SKU;
	}
	public void setSKU(String sKU) {
		SKU = sKU;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Long getInventoryId() {
		return inventoryId;
	}
	public void setInventoryId(Long inventoryId) {
		this.inventoryId = inventoryId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Long getDicountId() {
		return dicountId;
	}
	public void setDicountId(Long dicountId) {
		this.dicountId = dicountId;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Timestamp getModifiedAt() {
		return modifiedAt;
	}
	public void setModifiedAt(Timestamp modifiedAt) {
		this.modifiedAt = modifiedAt;
	}
	public Timestamp getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(Timestamp deletedAt) {
		this.deletedAt = deletedAt;
	}
	public void getAll() {
		System.out.println("It is a product");
	}
	public void updateProduct(String desc ) {
		System.out.println("This is method Overloading with one Parameter  "+ desc);
	}
	public void updateProduct(Long id, String SKU) {
		System.out.println("This is method Overloading with multiple parameter with id: "+id+ "and SKU: " + SKU);
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", desc=" + desc + ", SKU=" + SKU + ", categoryId=" + categoryId + ", inventoryId="
				+ inventoryId + ", price=" + price + ", dicountId=" + dicountId + ", createdAt=" + createdAt
				+ ", modifiedAt=" + modifiedAt + ", deletedAt=" + deletedAt + "]";
	}

}