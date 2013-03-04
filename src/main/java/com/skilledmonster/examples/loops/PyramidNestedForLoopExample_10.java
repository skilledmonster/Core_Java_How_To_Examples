package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 *				 * * * * * * 
 * 				   * * * * 
 *				    * * * 
 *				     * * 
 *				      * 
 *
 * @author Jagadeesh
 * 
 */
public class PyramidNestedForLoopExample_10 {

	public static void main(String[] args) {
		
		int levels = 5 ; 

		for (int i = 1; i <= levels; i++) {
			for (int s = 1; s < i; s++) {
				// add spacing
				System.out.print(" ");
			}
			for (int j = levels; j >= i; j--) {
				// display/add star
				System.out.print("* ");
			}
			// add new line
			System.out.println("");
		}
	}

}
