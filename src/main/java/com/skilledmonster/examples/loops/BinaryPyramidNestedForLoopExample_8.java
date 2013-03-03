package com.skilledmonster.examples.loops;

/**
 * Binary Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 * 
 *					0 
 *					1 0 
 *					0 1 0 
 *					1 0 1 0 
 *					0 1 0 1 0 
 *					1 0 1 0 1 0 
 * 
 * @author Jagadeesh
 * 
 */
public class BinaryPyramidNestedForLoopExample_8 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(((i + j) % 2) + " ");
			}
			System.out.println("");
		}
	}

}
