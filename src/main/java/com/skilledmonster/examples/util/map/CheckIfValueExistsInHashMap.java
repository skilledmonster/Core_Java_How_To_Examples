package com.skilledmonster.examples.util.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if a value exists in HashMap
 * 
 * This example shows how to check if a value exists in HashMap using
 * containsValue() method of HashMap Class
 * 
 * @author Jagadeesh
 * 
 */
public class CheckIfValueExistsInHashMap {

	public static void main(String[] args) {

		// create HashMap
		Map<String, String> hMap = new HashMap<String, String>();

		// add key value pairs to HashMap using put method
		hMap.put("A", "Apple");
		hMap.put("B", "Ball");
		hMap.put("C", "Cat");
		hMap.put("D", "Dog");

		// check if a key exists in HashMap by using containValue(Object Key)
		// method of HashMap class
		// it returns true if the key exists, otherwise it will return false
		boolean valueExists = hMap.containsValue("Apple");

		// display if the key exists
		System.out.println("Does HashMap with value Apple exists ? # "
				+ valueExists);

		valueExists = hMap.containsKey("Elephant"); // this key doesn't exist in
													// the map

		// display if the key exists
		System.out.println("Does HashMap with value Elephant exists ? # "
				+ valueExists);

	}

}
