package com.skilledmonster.examples.operations;

import java.util.Scanner;

/**
 * Program to generate Hailstone Sequence.
 * This program reads a number from the user then displays the Hailstone sequence
 * for that number followed by a line that shows the number of steps taken to reach 1.
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class HailstoneSequenceGenerator {

	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.printf("Enter a Number:  ");
		try {
			int number = inputScanner.nextInt();
			int steps = 0;
			while (number != 1) {
				if (number % 2 == 0) {
					System.out.println(number + " is even, so I take half: " + number / 2);
					number /= 2;
				} else {
					System.out.println(number + " is odd, so I make 3n + 1: " + (number * 3 + 1));
					number = number * 3 + 1;
				}
				steps++;
			}
			System.out.println("\nThe process took " + steps + (steps < 2 ? " step" : " steps") + " to reach 1");
		} catch (Exception e) {
			System.out.println("Not a Number!! Run your Program again :-)");
		}

	}
}
