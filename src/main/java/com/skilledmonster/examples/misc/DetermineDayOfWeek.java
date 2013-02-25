package com.skilledmonster.examples.misc;

import java.util.Calendar;
import java.util.Date;

/**
 * Determine day of the week
 * 
 * This example determines day of the week for TODAY
 * 
 * @author Jagadeesh
 *
 */
public class DetermineDayOfWeek {

	public static void main (String[] args) {
		Calendar c = Calendar.getInstance();
		// set time to today
		c.setTime(new Date());
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("Day of Week is # " + dayOfWeek);
	}

}
