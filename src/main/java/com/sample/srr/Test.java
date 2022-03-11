package com.sample.srr;

public class Test {
	
	public static void main(String[] args){  

	long t = System.currentTimeMillis();
	StringBuilder builder = new StringBuilder();
		  for (int i=0; i<10000; i++){  
		builder.append("asdff");
	}
System.out.println(System.currentTimeMillis()  -t);

StringBuffer buffer = new StringBuffer();
buffer.append("helllo");

//Immutable
	   String s="Java";  
	   s=s.concat(" Script");  
	   System.out.println(s);  
	   
	 
	 }  

}
	
	

