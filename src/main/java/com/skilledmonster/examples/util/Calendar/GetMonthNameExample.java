package com.skilledmonster.examples.util.calendar;

import java.util.Calendar;

/**
 * Get Current Month Name Example
 * 
 * This example shows how to get the current month name from the system using
 * java.util.Calendar class. The Calendar.get(Calendar.MONTH) returns the month
 * value as an integer starting from 0 as the first month and 11 as the last
 * month. This mean January equals to 0, February equals to 1 and so on.
 * 
 * @author Jagadeesh
 * 
 */
public class GetMonthNameExample {

	public static void main(String[] args) {
		// string array to hold list of all month name
		String[] monthName = { "January", "February", "March", "April", "May",
				"June", "July", "August", "September", "October", "November",
				"December" };
		// get an instance of Calendar object
		Calendar cal = Calendar.getInstance();
		// get corresponding month name using the array
		String month = monthName[cal.get(Calendar.MONTH)];
		//display
		System.out.println("Month name: " + month);
	}

}
