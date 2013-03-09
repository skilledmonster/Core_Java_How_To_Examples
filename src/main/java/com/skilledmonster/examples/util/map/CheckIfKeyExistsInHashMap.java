package com.skilledmonster.examples.util.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Check if a key exists in HashMap
 * 
 * This example shows how to check if a key exists in HashMap using
 * containsKey() method of HashMap Class
 * 
 * @author Jagadeesh
 * 
 */
public class CheckIfKeyExistsInHashMap {

	public static void main(String[] args) {

		// create HashMap
		Map<String, String> hMap = new HashMap<String, String>();

		// add key value pairs to HashMap using put method
		hMap.put("A", "Apple");
		hMap.put("B", "Ball");
		hMap.put("C", "Cat");
		hMap.put("D", "Dog");

		// check if a key exists in HashMap by using containKey(Object Key)
		// method of HashMap class
		// it returns true if the key exists, otherwise it will return false
		boolean keyExists = hMap.containsKey("A");

		// display if the key exists
		System.out.println("Does HashMap with key A exists ? # " + keyExists);

		keyExists = hMap.containsKey("E"); // this key doesn't exist in the map

		// display if the key exists
		System.out.println("Does HashMap with key E exists ? # " + keyExists);

	}

}
