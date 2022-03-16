/**
 * 
 */
package com.sample.manasvi;

import java.util.Comparator;

/**
 * @author manasvibhardwaj
 *
 */
public class Day8DiscountComparatorClass implements Comparator<Day8DiscountComparatorClass>{
	private long id;
	private String name;
	private String description;
	
	
	public Day8DiscountComparatorClass(long id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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


	@Override
	public int compare(Day8DiscountComparatorClass arg0, Day8DiscountComparatorClass arg1) {
		// TODO Auto-generated method stub
		return arg0.getDescription().compareTo(arg1.getDescription());
	}

}
