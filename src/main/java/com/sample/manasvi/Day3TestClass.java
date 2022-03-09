package com.sample.manasvi;
/**
 * @author manasvibhardwaj
 *
 */
public class Day3TestClass {
	
	
	//primitive Data Type
	int num = 5;              
	float flNum = 2.99f;    
	char mChar = 'M';         
	boolean mBoolean = true; //default value is False 
	    
	// non-primitive data types
	//Class, object, array, string, and interface 
	
	String mString = "Hello";
	int a[] = {11,21,31,41,51,61};  //Array non-Primitive
	
	 int aa = 12, bb = 5;
	 
	 public static int aaa = 4;
	 public static int var;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day3TestClass obj=new Day3TestClass();
		
		System.out.println("Primitive Data Types"+"\n"+"\n"+"Integer value = "+obj.num+"\n"+"Float value = "+obj.flNum+"\n"+"Character value = "+obj.mChar+"\n"+"Boolean value = "+obj.mBoolean+"\n");
		System.out.println("Non-Primitive Data Types"+"\n"+"\n"+"String value = "+obj.mString+"\n");
	     
		for(int i=0;i<6;i++)
		{
		System.out.println("Int Array Value = "  +obj.a[i]);	
		}
		
		System.out.println("Arithmetic operators ");
		// addition operator
	    System.out.println("aa + bb = " + (obj.aa + obj.bb));

	    // subtraction operator
	    System.out.println("aa - bb = " + (obj.aa - obj.bb));

	    // multiplication operator
	    System.out.println("aa * bb = " + (obj.aa * obj.bb));

	    // division operator
	    System.out.println("aa / bb = " + (obj.aa / obj.bb));

	    // modulo operator
	    System.out.println("aa % bb = " + (obj.aa % obj.bb));
		
		
	 // assignment operator
	    
	    System.out.println("assignment operator");
	    var = aaa;
	    System.out.println("var using =: " + var);

	    // assign value using =+
	    var += aaa;
	    System.out.println("var using +=: " + var);

	    // assign value using =*
	    var *= aaa;
	    System.out.println("var using *=: " + var);
	    
	    
	    
	    System.out.println("Relational operators");
	 // value of a and b
	    System.out.println("a is " + obj.aa + " and b is " +obj.bb);

	    // == operator
	    System.out.println(obj.aa == obj.bb);  // false

	    // != operator
	    System.out.println(obj.aa !=obj.bb);  // true

	    // > operator
	    System.out.println(obj.aa > obj.bb);  // true

	    // < operator
	    System.out.println(obj.aa < obj.bb);  // false

	    // >= operator
	    System.out.println(obj.aa >= obj.bb);  // true

	    // <= operator
	    System.out.println(obj.aa <= obj.bb);  // false
	    
	    
	    
	    System.out.println("Logical operators");
	 // && operator
	    System.out.println((5 > 3) && (8 > 5));  // true
	    System.out.println((5 > 3) && (8 < 5));  // false

	    // || operator
	    System.out.println((5 < 3) || (8 > 5));  // true
	    System.out.println((5 > 3) || (8 < 5));  // true
	    System.out.println((5 < 3) || (8 < 5));  // false

	    // ! operator
	    System.out.println(!(5 == 3));  // true
	    System.out.println(!(5 > 3));  // false
	    
	    String msg = obj.num > 10 ? "Number is greater than 10" : 
	    	  obj.num > 5 ? "Number is greater than 5" : "Number is less than equal to 5";
		
	    System.out.println("Message= "+msg);	  
	}

}
