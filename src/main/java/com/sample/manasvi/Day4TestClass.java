/**
 * 
 */
package com.sample.manasvi;

/**
 * @author manasvibhardwaj
 *
 */
public class Day4TestClass {
	
	private String productSKUCode;
	
   	public String getSkuCode() {
		return productSKUCode;
	}


	public void setSkuCode(String productSKUCode) {
		this.productSKUCode = productSKUCode;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	private String message ;
	
	public Day4TestClass(String skuCode) {
		super();
		this.productSKUCode = skuCode;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day4TestClass obj1=new Day4TestClass("896855188");

		//Switch case Assignment Day4
   	
   	switch (obj1.productSKUCode) {
       case "987654321":
           obj1.message = "car is toyota";
           break;
       case "109596592":
       	obj1.setMessage("car is Honda");
           break;
       case "896855188":
    	   obj1.setMessage("car is BMW");
           break;
       case "453577309":
    	   obj1.setMessage("car is Ducati");
           break;
       case "357107283":
    	   obj1.setMessage("car is mercedes");
           break;
       case "206041802":
    	   obj1.setMessage("car is Jaguar");
           break;
       
       default:
    	   obj1.setMessage("car name is unknown ");
       }
       System.out.println(obj1.getMessage());
		
       
           //String Builder VS String Buffer 

/*NOTE:-Findings
 * StringBuffer operations are thread-safe and synchronized on another hand StringBuilder operations are not thread-safe and not-synchronized.
 * StringBuffer is to used when multiple threads are working on the same String and StringBuilder is used in a single-threaded environment.
 * StringBuffer performance is slower when compared to StringBuilder and StringBuilder performance is faster when compared to StringBuffer.
 */
       
       long buffercurrentTime=System.currentTimeMillis();
       StringBuffer buffer=new StringBuffer();
       for(int i=0;i<10000000;i++)
       {
       buffer.append("Manasvibhardwaj");
       }
       System.out.println(System.currentTimeMillis()-buffercurrentTime);
       
       
       
       long buildercurrentTime=System.currentTimeMillis();
       StringBuilder builder=new StringBuilder();
       for(int i=0;i<10000000;i++)
       {
       builder.append("Manasvibhardwaj");
       }
       System.out.println(System.currentTimeMillis()-buildercurrentTime);
		
		
	}

}
