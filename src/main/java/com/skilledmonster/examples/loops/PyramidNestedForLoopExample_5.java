package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 			 * 
 * 			** 
 * 		   *** 
 *        **** 
 *       ***** 
 *      ****** 
 * 
 * @author Jagadeesh
 * 
 */
public class PyramidNestedForLoopExample_5 {

	public static void main(String[] args) {

		for (int i = 5; i >= 0; i--) {
			for (int s = 1; s <= i; s++) {
				// spacing at the beginning
				System.out.print(" ");
			}
			for (int j = 5; j >= i; j--) {
				// display/add star
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

}
