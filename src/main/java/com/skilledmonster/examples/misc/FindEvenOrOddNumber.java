package com.skilledmonster.examples.misc;

/**
 * Even Odd Number Example 
 * 
 * This example shows how to check if the given number
 * is an even or an odd number
 * 
 * @author Jagadeesh
 * 
 */
public class FindEvenOrOddNumber {

	public static void main(String[] args) {

		// create an array of 10 numbers
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// loop through all the numbers
		for (int i = 0; i < numbers.length; i++) {
			/**
			 * use modulus operator to check if the number is even or odd, if we
			 * divide any number by 2 and if the reminder is 0, then the number
			 * is even, otherwise it is odd number
			 */
			if (numbers[i] % 2 == 0)
				System.out.println(numbers[i] + " is even number.");
			else
				System.out.println(numbers[i] + " is odd number.");

		}

	}
}
