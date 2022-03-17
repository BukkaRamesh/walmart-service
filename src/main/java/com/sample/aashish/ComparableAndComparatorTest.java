/**
 * 
 */
package com.sample.aashish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;



/**
 * @author aashishshrestha
 *
 */
public class ComparableAndComparatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DiscountCombarable dis = new DiscountCombarable(1L, "Meat", "Meat of all Kinds", 10f);
		DiscountCombarable dis1 = new DiscountCombarable(2L, "Vegetable", "Vegetable of all Kinds", 12f);
		List<DiscountCombarable> list = new ArrayList<>();
		list.add(dis1);
		list.add(dis);
		// method 1
		Collections.sort(list);
		for (DiscountCombarable discountCombarable : list) {
			System.out.println(discountCombarable.getName());
			
		}
		//method 2
		List<DiscountCombarable> list1 = Arrays.asList(dis,dis1);
		for (DiscountCombarable discountCombarable1 : list1) {
			System.out.println(discountCombarable1.getName());
			
		}
		
		//method 3 using lambda:
		list.forEach((n)-> System.out.println(n));
		for (DiscountCombarable discountCombarable3 : list) {
			System.out.println(discountCombarable3.getName());
			
		}
		
		DiscountComparator comp = new DiscountComparator(2L, " Electronics", "Electronics Parts", 11f);
		DiscountComparator comp1 = new DiscountComparator(3L, "Carpenting", "Carpenting products", 5f);
		List<DiscountComparator> list4 = new ArrayList<>();
		list4.add(comp1);
		list4.add(comp);
		Comparator<DiscountComparator> name = new Comparator<DiscountComparator>() {

			@Override
			public int compare(DiscountComparator o1, DiscountComparator o2) {
				
				 return o1.getDescription().compareTo(o2.getDescription());
			}
			
		};
		
		Collections.sort(list4,name);
		for(DiscountComparator com: list4) {
			System.out.println(com.getDescription());
		}

		//lambda here!
			list4.sort((DiscountComparator o1, DiscountComparator o2)-> o1.getId().compareTo(o2.getId()));
			
				//java 8 only, lambda also, to print the List
				list4.forEach((developer)->System.out.println(developer));
	}

	

}
