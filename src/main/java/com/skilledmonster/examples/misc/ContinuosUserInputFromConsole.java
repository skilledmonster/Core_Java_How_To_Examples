package com.skilledmonster.examples.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuosUserInputFromConsole {

	public static void main(String[] args) throws IOException{
		String CurLine = ""; // Line read from standard in
		
		System.out.println("Enter a line of text (type 'quit' to exit): ");
		InputStreamReader converter = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(converter);

		
		while (!(CurLine.equals("quit"))){
			CurLine = in.readLine();
			
			if (!(CurLine.equals("quit"))){
				System.out.println("You typed: " + CurLine);
				System.out.println("Please enter something: ");
			}
		}
	}

}
