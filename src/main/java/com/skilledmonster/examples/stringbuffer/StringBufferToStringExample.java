package com.skilledmonster.examples.stringbuffer;

/**
 * StringBuffer to String Example
 * 
 * This example shows how to covert a StringBuffer to String Object using
 * toString method of StringBuffer
 * 
 * @author Jagadeesh
 * 
 */
public class StringBufferToStringExample {

	public static void main(String args[]) {

		// create StringBuffer object
		StringBuffer sbf = new StringBuffer("Hello World!");

		// covert StringBuffer to String object
		String str = sbf.toString();

		//display
		System.out.println("StringBuffer to String: " + str);
	}

}
