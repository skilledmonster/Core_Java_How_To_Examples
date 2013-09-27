package com.skilledmonster.examples.util.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMap {

	public static void main(String[] args) {
		
		// create HashMap
		Map<String, String> hMap = new HashMap<String, String>();
		
		// add key value pairs to HashMap using put method
		hMap.put("A", "Apple");
		hMap.put("B", "Ball");
		hMap.put("C", "Cat");
		hMap.put("D", "Dog");

		Iterator iter = hMap.keySet().iterator() ; 
		
		while(iter.hasNext()) {
			
			System.out.println("Key = " + iter.next());
		}
		
		Iterator iter_2 = hMap.entrySet().iterator() ; 
		
		while(iter_2.hasNext()) {
			
			Map.Entry<String, String> entry = (Entry<String, String>) iter_2.next() ;
			
			System.out.println("Key = " + entry.getKey() + "  -  Value =  " + entry.getValue());
		}
		

		for(int i = 1 ; i < 6 ; i ++ ) {
			
			System.out.println( i );
		}
		
		System.out.println("Using enhanced for loop ");
		
		for(Map.Entry<String, String> entry : hMap.entrySet() ) {
			
			System.out.println("Key = " + entry.getKey() + "  -  Value =  " + entry.getValue());
		}
		
		
	
	
	}

}
