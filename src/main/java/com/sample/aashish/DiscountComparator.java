package com.sample.aashish;

import java.util.Comparator;

public class DiscountComparator implements Comparator<DiscountComparator>{

	private Long id;
	private String name;
	private String description;
	private float discountPercent;
	public DiscountComparator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DiscountComparator(Long id, String name, String description, float discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountPercent = discountPercent;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getDiscountPercent() {
		return discountPercent;
	}
	public void setDiscountPercent(float discountPercent) {
		this.discountPercent = discountPercent;
		
	}
	@Override
	public int compare(DiscountComparator o1, DiscountComparator o2) {
		
		return o1.description.compareTo(o2.description);
	}
	@Override
	public String toString() {
		return "DiscountComparator [id=" + id + ", name=" + name + ", description=" + description + ", discountPercent="
				+ discountPercent + "]";
	}
	
}
