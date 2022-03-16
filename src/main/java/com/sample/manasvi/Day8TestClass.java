/**
 * 
 */
package com.sample.manasvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author manasvibhardwaj
 *
 */
public class Day8TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		//method 1 to add data to ArrayList
		List<String> listobj= new ArrayList<String>();
		listobj.add("apple");
		listobj.add("banana");
		listobj.add("papaya");
		listobj.add("starwberry");
		listobj.add("blueberry");
		listobj.add("raspberry");
		
		Collections.sort(listobj);
		
		listobj.sort(null);
		
		
		//method 2 to add data to ArrayList
		List<String> listobj2= Arrays.asList("apple","banana","papaya","strawberry");
		
		//method1 print
		for (String stringobj : listobj2) {
			System.out.println(stringobj);
		}
		
		//method2 print
	     listobj2.forEach(System.out::println);/*apple
		                                         banana
		                                         papaya
		                                         strawberry
		                                        */
	   //method3 print using lambda expression
		 listobj2.forEach((n)-> System.out.println(n));
				
		
		//method1 create list of Day8DiscountClass objects
		List<Day8DiscountComparableClass> listobj3 = new ArrayList<Day8DiscountComparableClass>();
		listobj3.add(new Day8DiscountComparableClass(1,"Apple","red color"));
		listobj3.add(new Day8DiscountComparableClass(2,"banana","yellow color"));
		listobj3.add(new Day8DiscountComparableClass(3,"strawberry","pink color"));
		listobj3.add(new Day8DiscountComparableClass(4,"blueberry","deep blue color"));
		
		
		
		//comparable (Day8DiscountComparableClass)
		Collections.sort(listobj3);
		//method1 print
		for (Day8DiscountComparableClass stringobj : listobj3)
		    {
			System.out.println("Description:-"+stringobj.getDescription()+"   id:-"+stringobj.getId()+"  name:-"+stringobj.getName());
		    }
			
		//comparator (Day8DiscountComparatorClass)
		
		List<Day8DiscountComparatorClass> listobj4 = new ArrayList<Day8DiscountComparatorClass>();
		listobj4.add(new Day8DiscountComparatorClass(11,"Apple","red color"));
		listobj4.add(new Day8DiscountComparatorClass(22,"banana","yellow color"));
		listobj4.add(new Day8DiscountComparatorClass(33,"strawberry","pink color"));
		listobj4.add(new Day8DiscountComparatorClass(44,"blueberry","deep blue color"));
		
		//sort by Description
		Comparator<Day8DiscountComparatorClass> sortByDec =new Comparator<Day8DiscountComparatorClass>() 
		{

			@Override
			public int compare(Day8DiscountComparatorClass o1, Day8DiscountComparatorClass o2) {
				// TODO Auto-generated method stub
				return o1.getDescription().compareTo(o2.getDescription());
			}
			
		};
	 
		Collections.sort(listobj4,sortByDec);
		
		for (Day8DiscountComparatorClass stringobj : listobj4)
	    {
		System.out.println("id:-"+stringobj.getId()+"  name:-"+stringobj.getName()+"    Description:-"+stringobj.getDescription());
	    }
		
		
		
		
		//Trying to sort this list by name
		List<Day8DiscountComparatorClass> listobj5 = new ArrayList<Day8DiscountComparatorClass>();
		listobj5.add(new Day8DiscountComparatorClass(11,"Apple","red color"));
		listobj5.add(new Day8DiscountComparatorClass(22,"banana","yellow color"));
		listobj5.add(new Day8DiscountComparatorClass(33,"strawberry","pink color"));
		listobj5.add(new Day8DiscountComparatorClass(44,"blueberry","deep blue color"));
		
		Comparator<Day8DiscountComparatorClass> sortByName =new Comparator<Day8DiscountComparatorClass>() 
		{

			@Override
			public int compare(Day8DiscountComparatorClass o1, Day8DiscountComparatorClass o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};
	 
		Collections.sort(listobj5,sortByName);
		
		for (Day8DiscountComparatorClass stringobj : listobj5)
	    {
		System.out.println("id:-"+stringobj.getId()+"  name:-"+stringobj.getName()+"    Description:-"+stringobj.getDescription());
	    }
	
		//lambda expression java8
		Comparator<Day8DiscountComparatorClass> sortByName2=(o1,o2) -> o1.getName().compareTo(o2.getName());
		Collections.sort(listobj5,sortByName2);
		
		
		//java8
		Comparator<Day8DiscountComparatorClass> sortByName3= Comparator.comparing(Day8DiscountComparatorClass :: getName);
		Collections.sort(listobj5,sortByName3);
	}

}
