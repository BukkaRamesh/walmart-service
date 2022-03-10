package com.sample.srr;

public class BufferBuilderTest {
	
	    public static void main(String[] args){  
	        long startTime = System.currentTimeMillis();  
	        StringBuffer sb = new StringBuffer("Test");  
	        for (int i=0; i<10000; i++){  
	            sb.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        startTime = System.currentTimeMillis();  
	        
	        StringBuilder sb2 = new StringBuilder("Test");  
	        for (int i=0; i<10000; i++){  
	            sb2.append("Tpoint");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
	   
	        //SwitchStatement
	        int number = 50;
	        switch(number) {
	        case 10: System.out.println("10");  
	        	break;
	        case 20: System.out.println("20");  
	        	break;
	        case 30: System.out.println("30");  
	        	break;
	        case 40: System.out.println("40");  
        	break;
	        case 50: System.out.println("50");  
        	break;
	        case 60: System.out.println("60");  
        	break;
	        	default:System.out.println("not 10,20 , 40, 50");
	        	
	        }
	}  
}
