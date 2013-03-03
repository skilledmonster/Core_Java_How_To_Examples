package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 *  
 *				   **
 *				  ****
 *				 ******
 *				********
 *				********
 *				 ******
 *				  ****
 *				   **
 * 
 * @author Jagadeesh
 *   
 */
public class PyramidNestedForLoopExample_7 {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int s = 5; s > i; s--) {
				// add spacing
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				//display/add star
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				//display/add star
				System.out.print("*");
			}
			// add new line
			System.out.println("");
		}
		for (int i = 1; i <= 5; i++) {
			for (int s = 1; s < i; s++) {
				// add spacing
				System.out.print(" ");
			}
			for (int j = 5; j > i; j--) {
				//display/add star
				System.out.print("*");
			}
			for (int j = 5; j > i; j--) {
				//display/add star
				System.out.print("*");
			}
			// add new line
			System.out.println("");
		}
	}

}
