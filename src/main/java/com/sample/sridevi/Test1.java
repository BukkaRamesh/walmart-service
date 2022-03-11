package com.sample.sridevi;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.time.ZoneId;
import java.util.Date;
import java.util.TimeZone;

public class Test1 {
	public static void main(String[] args) throws UserDefinedException  {
		
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyyy/mm/dd");
		ft.format(date);
		System.out.println(ft.format(date));
		
		LocalDate d = LocalDate.now();
		System.out.println(d);
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		
		DayOfWeek sunday = LocalDate.parse("2021-03-24").getDayOfWeek();
		System.out.println(sunday);
		
		DayOfWeek dayOfWeek = DayOfWeek.of(7);
		System.out.println(dayOfWeek);
		
		LocalDate dt1 = LocalDate.parse("2018-11-27");
		LocalDate  dt2 = LocalDate.parse("2017-11-27");
		System.out.println(dt1.isAfter(dt2));
		System.out.println(dayOfWeek);
		
		ZoneId zone = ZoneId.of("Europe/Paris");
		System.out.println(zone);
		
		TimeZone tz= TimeZone.getTimeZone("Europe/Paris");
		System.out.println(tz);
	    
		try {
		int[] a= {1,2,3};
		System.out.println(a[10]);
		}catch(Exception e) {
			System.out.println("something went wrong");
		}finally {
			System.out.println("not identified invalid");
		}
		
		   
	

	
	

	}
		
		
	}


	
	


