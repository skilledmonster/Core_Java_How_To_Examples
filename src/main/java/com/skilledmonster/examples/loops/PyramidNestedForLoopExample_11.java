package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 *		   		    1
 *		          2 1 2
 *		        3 2 1 2 3
 *		      4 3 2 1 2 3 4
 *		    5 4 3 2 1 2 3 4 5   
 *
 * @author Jagadeesh
 * 
 */
public class PyramidNestedForLoopExample_11 {

	public static void main(String[] args) {

		// levels in the pyramid
		int x = 5;

		for (int i = 1; i <= x; i++) {
			// for spacing
			for (int j = 1; j <= x - i; j++){
				System.out.print("   ");
			}
			// left half of the pyramid
			for (int k = i; k >= 1; k--){
				System.out.print((k >= 10) ? +k : "  " + k);
			}
			// corresponding right half of the pyramid
			for (int k = 2; k <= i; k++) {
				System.out.print((k >= 10) ? +k : "  " + k);
			}
			// next line
			System.out.println();
		}
	}

}
