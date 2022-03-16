/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Day8DiscountComparableClass implements Comparable<Day8DiscountComparableClass>{
	private long id;
	private String name;
	private String description;
	
	
	public Day8DiscountComparableClass(long id, String name, String description) {
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
	public int compareTo(Day8DiscountComparableClass o) {
		// TODO Auto-generated method stub
		
		
		return this.getName().compareTo(o.getName());
	}

}
