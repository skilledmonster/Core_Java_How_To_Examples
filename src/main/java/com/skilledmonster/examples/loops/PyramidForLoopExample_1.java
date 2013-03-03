package com.skilledmonster.examples.loops;

/**
 * Pyramid Example - Demonstrate For Loop
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 * 			* 
 * 			** 
 * 			*** 
 * 			**** 
 * 			*****
 * 
 * @author Jagadeesh
 * 
 */
public class PyramidForLoopExample_1 {

	public static void main(String[] args) {
		
        for(int i=1; i<= 5 ;i++){
               
        	for(int j=0; j < i; j++){
        		// display/add star
        		System.out.print("*");
            }
            // generate a new line
        	System.out.println("");
        }
	}

}
