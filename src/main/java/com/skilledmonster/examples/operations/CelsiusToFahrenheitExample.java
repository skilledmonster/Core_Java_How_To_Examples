package com.skilledmonster.examples.operations;

/**
 * Celsius to Fahrenheit Convertor
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class CelsiusToFahrenheitExample {

	public static void main(String[] args) {

		// celsius temperature is a constant
		final double celcius = 1;
		double fahrenheit;

		// calculate fahrenheit temperature using formula
		fahrenheit = ((9.0 / 5.0) * celcius) + 32.0;

		// display intro message

		System.out.println("This program converts Celsius to Fahrenheit");

		// display the result

		System.out.println("Celsius Temp = " + celcius);
		System.out.println("Fahrenheit Temp = " + fahrenheit);

		// display end message

		System.out.println("End of program");

	}

}