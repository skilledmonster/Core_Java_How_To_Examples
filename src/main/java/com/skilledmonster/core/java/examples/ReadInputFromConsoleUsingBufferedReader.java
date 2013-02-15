package com.skilledmonster.core.java.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read user input from console
 * 
 * This example shows how to read user input from console/keyboard using
 * BufferedReader class
 * 
 * @author Jagamot
 * 
 */
public class ReadInputFromConsoleUsingBufferedReader {

	public static void main(String[] args) {
		String username = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		System.out.print("Please enter user name : ");
		try {
			username = reader.readLine();
			System.out.println("UserName Entered is # " + username);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
