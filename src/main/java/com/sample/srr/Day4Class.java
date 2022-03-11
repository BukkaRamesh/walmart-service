package com.sample.srr;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

public class Day4Class {
	  
		public static void main(String[] args) {    
		 
			Date date = new Date();
			System.out.println(date);
			
			SimpleDateFormat ft = new SimpleDateFormat("yyyy/mm/dd");
			ft.format(date);
			System.out.println(ft.format(date));
			
			//local date.now gives current date
			
			LocalDate localDate = LocalDate.now();
			LocalDate deliveryDate = LocalDate.now().plusDays(5); //Delivery Date
			System.out.println(deliveryDate);
			
			//local date in previous month same day
			LocalDate pmSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
			System.out.println(pmSameDay);
			
			//LocalTime
			LocalTime now = LocalTime.now();
			System.out.println(now);
			
//get day of week
			DayOfWeek day = DayOfWeek.of(3);  
		    System.out.println("Day of Week :" + day.name()); 
 
 LocalDate date1 = LocalDate.of(2022, Month.APRIL, 2);  
 DayOfWeek day1 = DayOfWeek.from(date1);  
 System.out.println(day1.getValue());  

//=======================
 //TImeZone
     

 TimeZone zone = TimeZone.getDefault(); 
 String name = zone.getDisplayName();         
 System.out.println("Time zone: "+ name);  
    
 System.out.println("The ID  " + zone.getID());  
 
 //====================================================================================
		  
 
 //Switch statement 
 
 int month=1;    
 String monthString="";  
		  		    
		    switch(month){    
		  
		    case 1: monthString="1 - January";  
		     break;    
		    case 2: monthString="2 - February";
		     break;    
		    case 3: monthString="3 - March";  
		    break;    
		    case 4: monthString="4 - April";  
		    break;    
		    case 5: monthString="5 - May";  
		    break;    
		    case 6: monthString="6 - June";  
		    break;    
		    case 7: monthString="7 - July";  
		    break;    
		    case 8: monthString="8 - August";  
		    break;    
		    case 9: monthString="9 - September";  
		    break;    
		    case 10: monthString="10 - October";  
		    break;    
		    case 11: monthString="11 - November";  
		    break;    
		    case 12: monthString="12 - December";  
		    break;    
		    default:System.out.println("Invalid Month!");    
		    }    
		    //Printing month of the given number  
		    System.out.println(monthString);  
		}    
		}   
