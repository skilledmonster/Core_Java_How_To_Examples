package com.skilledmonster.examples.io;

import java.util.Scanner;

public class ReadConsoleInputUsingScanner {

	public static void main(String[] args) {
		System.out.println("Enter your Name # " );
		
		Scanner scanner = new Scanner(System.in) ;
		String str = scanner.nextLine() ;
		
		scanner.close() ; 
		
		System.out.println("You name # " + str );
		
	}

}
