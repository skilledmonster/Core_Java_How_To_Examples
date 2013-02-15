package com.skilledmonster.core.java.examples;

/**
 * Find factorial of a number non recursively
 * 
 * This example finds factorial of a number using non recursive approach
 * 
 * Factorial of any number is n!. For example, factorial of 4 = 4*3*2*1 = 24
 * 
 * @author Jagamot
 * 
 */
public class FindFactorialNonRecursion {

	public static void main(String[] args) {

		// find factorial of 5
		int number = 5;

		int factorial = number;

		for (int i = 1; i < 5; i++) {

			factorial = factorial * i;
		}

		System.out.println("Factorial of a number is " + factorial);
	}
}
