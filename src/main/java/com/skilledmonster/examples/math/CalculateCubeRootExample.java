package com.skilledmonster.examples.math;

/**
 * Calculate Cube Root of a Number
 * 
 * This example shows how to use java.lang.Math package to calculate Cube Root
 * of a Number
 * 
 * @author Jagadeesh
 * 
 */
public class CalculateCubeRootExample {

	public static void main(String[] args) {
		// number for which we will get cube root
		double cube = 125.0d;
		// get the cube root of double value
		double cbrt = Math.cbrt(cube);
		// display
		System.out.println("Cube root of " + cube + " is # " + cbrt);

	}

}
