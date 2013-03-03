package com.skilledmonster.examples.loops;

/**
 * Number Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 * 
 *			                       1
 *			                    2  1  2
 *			                 3  2  1  2  3
 *			              4  3  2  1  2  3  4
 *			           5  4  3  2  1  2  3  4  5
 *			        6  5  4  3  2  1  2  3  4  5  6
 *			     7  6  5  4  3  2  1  2  3  4  5  6  7
 *			  8  7  6  5  4  3  2  1  2  3  4  5  6  7  8
 * 
 * @author Jagadeesh
 * 
 */
public class NumberPyramidNestedForLoopExample_9 {

	public static void main(String[] args) {

		int x = 8;

		for (int i = 1; i <= x; i++) {

			for (int j = 1; j <= x - i; j++) {
				// add spacing
				System.out.print("   ");
			}

			for (int k = i; k >= 1; k--) {
				// display number
				System.out.print((k >= 10) ? +k : "  " + k);
			}

			for (int k = 2; k <= i; k++) {
				// display number
				System.out.print((k >= 10) ? +k : "  " + k);
			}
			// new line
			System.out.println();
		}
	}

}
