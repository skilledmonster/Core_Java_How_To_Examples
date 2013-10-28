package com.skilledmonster.examples.concurrency;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.skilledmonster.examples.common.concurrency.Task;

/**
 * This example shows how to run a task in an executor after a delay
 * 
 * @author Jagadeesh Motamarri
 * @version 1.0
 */
public class RunningTaskExecutorDelayExample {

	public static void main(String[] args) {

		// create executor with a scheduled thread pool of size 2
		ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(2);

		// initialize and start new tasks
		System.out.printf("Main Thread: Started at: %s\n", new Date());
		for (int i = 0; i < 5; i++) {
			Task task = new Task("Task # " + i);
			executor.schedule(task, i + 1, TimeUnit.SECONDS);
		}

		// finalize
		executor.shutdown();

		// wait for the finalization of all the tasks
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// displayc completion time
		System.out.printf("Main Thread: Ended at: %s\n", new Date());
	}
}
