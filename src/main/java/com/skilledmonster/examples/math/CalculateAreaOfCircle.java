package com.skilledmonster.examples.math;

/**
 * Calculate Area of a Circle
 * 
 * This example shows how to calculate area of a circle using java.lang.math
 * package
 * 
 * @author Jagadeesh
 * 
 */
public class CalculateAreaOfCircle {

	public static void main(String[] args) {

		// radius of circle
		double radius = 5;
		// calculate area of a circle using Math.PI
		double circleArea = Math.PI * Math.pow(radius, 2);
		// display
		System.out.println("Area of a Cirle with Radius " + radius + " is # "
				+ circleArea);

	}

}
