package com.skilledmonster.examples.common.concurrency;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * A simple Task that returns a String after execution. This is a common class used to demonstrate several concurrency example.
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class Task implements Callable<String> {

	// name of the task
	private String name;

	// initialize the task name
	public Task(String name) {
		this.name = name;
	}

	// write to console and return a message
	public String call() throws Exception {
		System.out.printf("%s: Started at : %s\n", name, new Date());
		return "Welcome Skilled Monster !!";
	}

}
