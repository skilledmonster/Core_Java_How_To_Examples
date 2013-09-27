package com.skilledmonster.examples.util.map;

import java.util.HashMap;
import java.util.Map;
/**
 * Get size of HashMap
 * 
 * This example shows how to check size (number of elements) of HashMap using
 * size() method of HashMap Class
 * 
 * @author Jagadeesh
 * 
 */
public class GetSizeOfHashMap {

	public static void main(String[] args) {

		// create HashMap
		Map hMap = new HashMap();
		
		//Map<String, String> hMap = new HashMap<String, String>();
		
		// display size of the HashMap using size() method
		System.out.println("Initial size of HashMap # " + hMap.size());

		// add key value pairs to HashMap using put method
		hMap.put("A", "Apple");
		
		
		hMap.put("B", "Ball");
		hMap.put("C", "Cat");
		hMap.put("D", "Dog");
		
		Map hMap2 = new  HashMap();
		hMap2.put("E", "Elephant") ;
		hMap2.put("F", "Fox") ;
		
		
		hMap.putAll(hMap2) ;
		
		

		// display size of the HashMap using size() method
		System.out.println("Size of HashMap after adding elements # "
				+ hMap.size());

		// remove key value pairs from HashMap using remove method
		hMap.remove("A");

		// display size of the HashMap using size() method
		System.out.println("Size of HashMap after removing elements # "
				+ hMap.size());

		
		System.out.println("Get value of A #"  + hMap.get("B")); 
		
	}

}
