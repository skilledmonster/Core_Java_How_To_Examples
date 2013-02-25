package com.skilledmonster.examples.stringbuffer;

/**
 * StringBuffer Reverse Example 
 * 
 * This example shows how to reverse the content of 
 * the StringBUffer using reverse method of StringBuffer Class
 * 
 * @author Jagadeesh
 * 
 */
public class StringBufferReverseExample {

	public static void main(String[] args) {

		// create StringBuffer object
		StringBuffer sb = new StringBuffer(
				"Hello World!! String Buffer Reverse Example!!");
		// display
		System.out.println("Original StringBuffer Content # " + sb);

		// To reverse the content of the StringBuffer use reverse method
		sb.reverse();
		// display
		System.out.println("Reversed StringBuffer Content # " + sb);
	}
	
}
