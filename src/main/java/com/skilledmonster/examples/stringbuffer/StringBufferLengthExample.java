package com.skilledmonster.examples.stringbuffer;
/**
 * StringBuffer Length Example
 * 
 * This example shows how to get length of a StringBuffer Object
 * 
 * @author Jagadeesh
 *
 */
public class StringBufferLengthExample {

	public static void main(String[] args) {

		// use length() method of StringBuffer Class to get length of the StringBuffer Object
		StringBuffer sb = new StringBuffer("Hello World");
		
		// get length
		int len = sb.length();
		
		// display
		System.out.println("Length of a StringBuffer Object is # " + len);
	}

}
