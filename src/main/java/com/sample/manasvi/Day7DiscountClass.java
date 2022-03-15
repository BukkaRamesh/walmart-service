/**
 * 
 */
package com.sample.manasvi;

import java.sql.Timestamp;

/**
 * @author manasvibhardwaj
 *
 */
public class Day7DiscountClass extends Day7ProductClass {
	//id, name, description, discountPercent, createdAt, modifiedAt, deletedAt
	private Integer id;
	private String name;
	private String description;
	private Timestamp createdAt;
	private Timestamp modifiedAt;
	private Timestamp deletedAt;
    private Day7ProductClass day7ProductClass;
	
	//Integer pid, String pname, String pdescription,
    public Day7DiscountClass() {
		super();
	}
	public Day7DiscountClass( Integer id, String name,
			String description,Day7ProductClass object) {
		super();
		this.day7ProductClass=object;
		this.id = id;
		this.name = name;
		this.description = description;
		
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
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
		System.out.println("This is DiscountClass");	
		}
    //Method OverLoading
	public void updateProduct() {
    	System.out.println("This is DiscountClass Method Overriding");	
		
	   }
	public void printValueDiscountCass() 
    {
    	System.out.println("This is DiscountClass Values");	
    }


	
}
