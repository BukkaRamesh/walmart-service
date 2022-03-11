/**
 * 
 */
package com.sample.manasvi;
import java.time.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author manasvibhardwaj
 *
 */

class ListOfNumbers {

	  // create an integer array
	  private int[] list = {5, 6, 8, 9, 2};

	  // method to write data from array to a file
	  public void writeList() {
	    PrintWriter out = null;

	    try {
	      System.out.println("Entering try statement");

	      // creating a new file OutputFile.txt
	      out = new PrintWriter(new FileWriter("OutputFile.txt"));

	      // writing values from list array to Output.txt
	      for (int i = 0; i < 7; i++) {
	        out.println("Value at: " + i + " = " + list[i]);
	      }
	    }
	    
	    catch (NumberFormatException e1) {
	        System.out.println("NumberFormatException => " + e1.getMessage());
	        System.out.println( e1.getClass().getCanonicalName());
	      }
	    catch (Exception e) {
		      System.out.println("Exception => " + e.getMessage());
		      System.out.println( e.getClass().getCanonicalName()); 
		    
		    }
	    finally {
	      // checking if PrintWriter has been opened
	      if (out != null) {
	        System.out.println("Closing PrintWriter");
	        // close PrintWriter
	        out.close();
	      }
	      
	      else {
	        System.out.println("PrintWriter not open");
	      }
	    }

	  }
	}
public class Day5TestClass {

	/**
	 * @param args
	 * @throws Day5UserDefinedExceptionClass 
	 *  
	 */
	public static void main(String[] args) throws Day5UserDefinedExceptionClass  {
		// TODO Auto-generated method stub
		
		
		
		
		//calling this for Run time Exception and checked exception
		   ListOfNumbers list = new ListOfNumbers();
		   list.writeList();
	    
	   
	   
	    
	    //Example of user defined exception
	       
//	        Integer calculate =10/10;
//	        throw new Day5UserDefinedExceptionClass("it is user defined Exception");
		   
	  
	       
	       
	    // DateTime Objects LocalDate  LocalTime ZoneId DayOfWeek
	       
	        //Assignment-check Boolean value after using isAfter()
	        LocalDate datenow =LocalDate.now();
	        System.out.println("Today date: "+datenow);
	        boolean checkvalue1=LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
	        System.out.println("Boolean: "+checkvalue1);
	        boolean checkvalue2=LocalDate.parse("2016-06-12").isAfter(datenow);
	        System.out.println("Boolean: "+checkvalue2);

	}

}
