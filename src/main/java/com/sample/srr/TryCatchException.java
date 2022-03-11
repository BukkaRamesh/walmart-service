package com.sample.srr;

public class TryCatchException {

public static void main(String[] args) throws UserDefinedException{  
	try {
	 int data=100/0;  }
catch(ArithmeticException e){System.out.println(e);}  
//rest code of the program   
System.out.println("ArithmeticException ");  

//=====================================================================================
//array exception
try  
{  
int arr[]= {1,3,5,7}; 
System.out.println(arr[10]); 
}  
     catch(ArrayIndexOutOfBoundsException e)  
{  
    System.out.println(e);  
}  
System.out.println("array exception");  
//=======================================================================================
//Multiple Catch

try{    
    int a[]=new int[7];    
    a[7]=20/0;    
   }    
   catch(ArithmeticException e)  
      {  
       System.out.println("Arithmetic Exception");  
      }    
   catch(ArrayIndexOutOfBoundsException e)  
      {  
       System.out.println("ArrayIndexOutOfBounds Exception");  
      }    
     System.out.println("Exceptions");    

}
}
