package com.skilledmonster.examples.loops;

/**
 * Pyramid - Nested For Loop Example
 * 
 * This example shows how to generate a pyramid like the one shown below using
 * simple Java for loop
 * 
 * 			*****
 * 			****
 * 			***
 * 			**
 * 			*
 * 
 * @author Jagadeesh
 * 
 */
public class PyramidNestedForLoopExample_2 {

	public static void main(String[] args) {
		
        for(int i=5; i>0 ;i--){
            
            for(int j=0; j < i; j++){
            	// display/add star
                System.out.print("*");
            }
           
            //generate a new line
            System.out.println("");
    }
        
	}

}
