package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 1 2 3 4 5
 * 2 3 4 5
 * 3 4 5
 * 4 5
 * 5
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class PyramidNestedForLoopExample_9 {

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			for (int j = i; j < 6; j++) {
				// display/add star
				System.out.print(" " + j + " ");
			}
			// add new line
			System.out.println("");
		}
	}
}
