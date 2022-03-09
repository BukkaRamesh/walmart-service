package com.sample.aashish;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private int id;
	private String desc;
	private String SKU;
	private int inventoryId;
	private double price;
	private int dicountId;
	private String createdAt;
	private String modifiedAt;
	private String deletedAt;

	public Product(int id, String desc, String sKU, int inventoryId, double price, int dicountId, String createdAt,
			String modifiedAt, String deletedAt) {
		super();
		this.id = id;
		this.desc = desc;
		this.SKU = sKU;
		this.inventoryId = inventoryId;
		this.price = price;
		this.dicountId = dicountId;
		this.createdAt = createdAt;
		this.modifiedAt = modifiedAt;
		this.deletedAt = deletedAt;
	}

	public Product() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public int getInventoryId() {
		return inventoryId;
	}

	public void setInventoryId(int inventoryId) {
		this.inventoryId = inventoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getDicountId() {
		return dicountId;
	}

	public void setDicountId(int dicountId) {
		this.dicountId = dicountId;
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

	@Override
	public String toString() {
		return "Product [id=" + id + ", desc=" + desc + ", SKU=" + SKU + ", inventoryId=" + inventoryId + ", price="
				+ price + ", dicountId=" + dicountId + ", createdAt=" + createdAt + ", modifiedAt=" + modifiedAt
				+ ", deletedAt=" + deletedAt + "]";
	}

	public static void main(String[] args) {
		Product product = new Product(123, "Meat", "HLR7563",4321 , 123.21, 567,"2021-01-10", "2021-10-11", "2022-01-02");
		System.out.println(product);
		Product product1 = new Product(213, "Vegetables", "RDF2312", 2345, 100.00, 123, "2021-01-10", "2021-09-12", "2022-02-10");
		System.out.println(product1);

		if(product.getDesc()== product1.getDesc()) {
			System.out.println("It is the same Item");
		}else if(product.getCreatedAt()!= product1.getCreatedAt()){
			System.out.println("It's not created on Same date");
			
		}else {
			System.out.println(" It is not the same Item");
		}
		
		if((product.getPrice() > product1.getPrice()) && (product.getDesc().length() < product1.getDesc().length())){
			System.out.println("True");
		} else if((product.getPrice() >= product1.getPrice()) || (product.getDesc().length() <= product.getDesc().length())) {
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		

	}

}
