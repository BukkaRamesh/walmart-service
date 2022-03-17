package com.sample.aashish;

public class DiscountCombarable implements Comparable<DiscountCombarable> {
	
	private Long id;
	private String name;
	private String description;
	private float discountPercent;
	
	
	public DiscountCombarable(Long id, String name, String description, float discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.discountPercent = discountPercent;
	}


	public DiscountCombarable() {
		super();
		// TODO Auto-generated constructor stub
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
	public int compareTo(DiscountCombarable o) {
		return this.getName().compareTo(o.getName());
	}

}
