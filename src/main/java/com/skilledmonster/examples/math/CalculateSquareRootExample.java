package com.skilledmonster.examples.math;

/**
 * Calculate Square Root of a Number
 * 
 * This example shows how to use java.lang.Math package to calculate Square Root
 * of a Number
 * 
 * @author Jagadeesh
 * 
 */
public class CalculateSquareRootExample {

	public static void main(String[] args) {
		// number for which we will get square root
		double square = 625.0d;
		// get the square root of double value
		double sqrt = Math.sqrt(square);
		// display
		System.out.println("Square root of " + square + " is # " + sqrt);

	}

}
