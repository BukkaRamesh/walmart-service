package com.sample.srr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.saple.srr1.Category;
import com.sample.srr.Laptop;

public class Day8 {

	//List -- Linked List and Array List
//Set  -- won't allow duplicate values
	//HashSet -- hash table mechanisum
	//LinkedHashSet
	//TreeSet
	public static void main(String[] args)
	{
		List<Laptop> laps = new ArrayList<Laptop>();
		System.out.println("HELLO List............");
		
		laps.add(new Laptop ("Dell", 14, 800));
		laps.add(new Laptop ("HP", 18, 700));
		laps.add(new Laptop ("MAC", 16, 600));
		laps.add(new Laptop ("HP5", 19, 500));
		laps.add(new Laptop ("Dell6", 20, 600));
		laps.add(new Laptop ("Dell", 14, 800));
		laps.add(new Laptop ("HP", 18, 700));
		laps.add(new Laptop ("MAC", 16, 600));
		laps.add(new Laptop ("HP5", 19, 500));
		laps.add(new Laptop ("Dell6", 20, 600));
		
	Collections.sort(laps);
	laps.forEach(System.out::println);
	
	System.out.println("HELLO Set............");
Set<Laptop> bb = new HashSet<Laptop>();

bb.add(new Laptop("DELL", 15, 200));
bb.add(new Laptop("HP", 20, 400));
bb.add(new Laptop("MAC", 15, 600));
bb.add(new Laptop("MACP", 25, 200));
bb.add(new Laptop("MACP", 25, 200));

	
bb.forEach(System.out::println);

Set<Laptop> bc = new HashSet<Laptop>();
//LinkedHashSet  -- Insertion Order
bc.forEach ((b) -> System.out.println(b));

//TreeSet  - ascending order , natural sorting a-z
// Set<String> s = new TreeSet<String>();
// s.add(null);
// System.out.println(s);


System.out.println("TreeSet");
Set<Laptop> lp = new TreeSet<Laptop>();

lp.add(new Laptop("DELL", 15, 200));
lp.add(new Laptop("HP", 20, 400));
lp.add(new Laptop("MAC", 15, 600));
lp.add(new Laptop("MACP", 25, 200));
lp.add(new Laptop("MACP", 25, 200));

lp.forEach((q) -> System.out.println(q));


//Map key value , duplicates not allowed

Map<Integer, String> data = new HashMap<Integer, String>();
data.put(1, "AA");
data.put(3, "BB");
data.put(2, "NN");
data.put(2, "DD");
data.put(1, "AA");


System.out.println(data);

}
}


//Map
//HashMap
//LinkedHashMap 
//TreeMap