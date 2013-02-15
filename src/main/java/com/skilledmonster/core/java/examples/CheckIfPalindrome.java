package com.skilledmonster.core.java.examples;

/**
 * Palindrome Example
 * 
 * Check if the number is Palindrome.
 * 
 * If the number is equal to it's reversed number, then the given number is a
 * palindrome number.
 * 
 * For example, 141 is a palindrome number while 17 is not.
 * 
 * @author Jagadeesh
 * 
 */
public class CheckIfPalindrome {

	public static void main(String[] args) {

		// array of numbers to be checked
		int numbers[] = new int[] { 131, 17, 22, 989, 100, 202 };

		// iterate through the numbers
		for (int i = 0; i < numbers.length; i++) {

			int number = numbers[i];
			int reversedNumber = 0;
			int temp = 0;

			// reverse the number
			while (number > 0) {
				temp = number % 10;
				number = number / 10;
				reversedNumber = reversedNumber * 10 + temp;
			}

			// finally, compare the numbers
			if (numbers[i] == reversedNumber)
				System.out.println(numbers[i] + " is a palindrome number");
			else
				System.out.println(numbers[i] + " is not a palindrome number");
		}

	}
}
