package com.sample.manasvi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Day9MapTestClass {

	public static void main(String[] args) {
		

		//1:-Doesn't maintain the order of insertion of elements
		//2:-Doesn't allow Duplicate (key,value) pair
		//3:-If key is Duplicate and value is different then new value will be overridden
		//
		
		
		
		
		
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		 
        // Inserting data in the Map
        hashmap.put("vishal", 10);
        hashmap.put("sachin", 30);
        hashmap.put("vaibhav", 20);
        hashmap.put(null, null);    //it allows null values as a key and value
//      map.put("vaibhav", 20);  tried to insert duplicate value-it doesn't print it
 
        for (Map.Entry<String, Integer> e : hashmap.entrySet())
        	 
            // Printing key-value pairs
            System.out.println("Hash map Key:-"+e.getKey() + "   hash map Value:-"+ e.getValue());
        
        
       
        Map<String, Day7ProductClass> hashmapobj = new HashMap<String, Day7ProductClass>();
        hashmapobj.put("HashMap First Record",new Day7ProductClass(1,"Apple","red color") );
        hashmapobj.put("HashMap Second Record",new Day7ProductClass(2,"banana","yellow color") );
        hashmapobj.put("HashMap Third Record",new Day7ProductClass(3,"strawberry","pink color") );
        hashmapobj.put("HashMap FOurth Record",new Day7ProductClass(4,"blueberry","deep blue color") );
        
       
        
        for (Map.Entry<String, Day7ProductClass> e : hashmapobj.entrySet())
       	 
            // Printing key-value pairs
            System.out.println("Hash map Key:-"+e.getKey() + "   hash map Value:-"+ e.getValue());
       
        
        
        
//------------------------------------------------------------------------------------------------------------------------        
        
     // Creating LinkedHashMap
        Map<String, Integer> linkedhashmapobj = new LinkedHashMap<String, Integer>();
 
        linkedhashmapobj.put("vishal", 10);
        linkedhashmapobj.put("sachin", 30);
        linkedhashmapobj.put("vaibhav", 20);
     // linkedhashmapobj.put("vaibhav", 200);    //value will be overridden
        linkedhashmapobj.put(null, null);       //it allows null values as a key and value
 
        // Iterating over Map
        for (Map.Entry<String, Integer> e : linkedhashmapobj.entrySet())
 
            // Printing key-value pairs
            System.out.println("Linked hash map key:-"+e.getKey() + "      Linked hash map value:- "+ e.getValue());
        
        
        
        
        
        
        Map<String, Day7ProductClass> linkedhashmapobj1 = new LinkedHashMap<String, Day7ProductClass>();
        linkedhashmapobj1.put("Linked HashMap First Record",new Day7ProductClass(1,"Apple","red color") );
        linkedhashmapobj1.put("Linked HashMap Second Record",new Day7ProductClass(2,"banana","yellow color") );
        linkedhashmapobj1.put("Linked HashMap Third Record",new Day7ProductClass(3,"strawberry","pink color") );
        linkedhashmapobj1.put("Linked HashMap FOurth Record",new Day7ProductClass(4,"blueberry","deep blue color") );
        
       
        
        for (Map.Entry<String, Day7ProductClass> e : linkedhashmapobj1.entrySet())
       	 
            // Printing key-value pairs
            System.out.println("Linked Hash map Key:-  "+e.getKey() + "       Linked  hash map Value:-  "+ e.getValue());
	
	
//-------------------------------------------------------------------------------------------------------------------------------------------	
	
      //TreeMap Doesn't allow null as a Key gives null pointer Exception
        
        
        
        // Creating  TreeMap
        Map<String, Integer> treemapobj = new TreeMap<String, Integer>();
 
        // Inserting data in the TreeMap
        
        treemapobj.put("vishal", 100);
        treemapobj.put("sachin", 300);
        treemapobj.put("vaibhav", 200);
        treemapobj.put("vaibhav", 200);      //don't allow duplicate key value
        //treemapobj.put(null, 90);          //Doesn't allow null as a Key gives null pointer Exception
        // Iterating over Map using for each loop
        for (Map.Entry<String, Integer> e :treemapobj.entrySet())
 
            // Printing key-value pairs
            System.out.println("Tree Map Key:-"+e.getKey() + "    Tree Map Value:-" + e.getValue());
	
	
	
	
        
        Map<String, Day7ProductClass> treemapobj1 = new TreeMap<String, Day7ProductClass>();
        treemapobj1.put("Tree Map First Record",new Day7ProductClass(1,"Apple","red color") );
        treemapobj1.put("Tree Map Second Record",new Day7ProductClass(2,"banana","yellow color") );
        treemapobj1.put("Tree Map Third Record",new Day7ProductClass(3,"strawberry","pink color") );
        treemapobj1.put("Tree Map FOurth Record",new Day7ProductClass(4,"blueberry","deep blue color") );
        
       
        
        for (Map.Entry<String, Day7ProductClass> e : linkedhashmapobj1.entrySet())
       	 
            // Printing key-value pairs
            System.out.println("Tree Map Key:-  "+e.getKey() + "       Tree Map Value:-  "+ e.getValue());
	
	}

}
