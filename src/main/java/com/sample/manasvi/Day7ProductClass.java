/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Day7ProductClass {
	
	private Integer pid;
	private String pname;
	private String pdescription;
	
	
	
	public Day7ProductClass() {}
	
	public Day7ProductClass(Integer pid, String pname, String pdescription) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPdescription() {
		return pdescription;
	}

	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}

	public void getAll() {
		System.out.println("This is ProductClass");	
		}
	
    //Method OverRiding
    public void updateProduct() {
    	System.out.println("This is ProductClass Method Overriding");	
		
	   }
    public void printValueProductCass() 
    {
    	System.out.println("This is ProductClass Values"+getPdescription()+getPname()+getPid());	
    }
}
