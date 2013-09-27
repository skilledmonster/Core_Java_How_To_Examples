package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class PyramidNestedForLoopExample_8 {

	public static void main(String[] args) {
		int cnt = 1;
		int check = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print(" " + i + " ");

			check++;
			if (cnt == check) {
				System.out.println();
				cnt++;
				check = 0;
			}
		}
	}
}
