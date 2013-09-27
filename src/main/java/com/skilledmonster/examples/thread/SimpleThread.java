package com.skilledmonster.examples.thread;

public class SimpleThread extends Thread {
	
	public void run() {

		for (int i = 0; i < 10; i++) {
			System.out.println("Count # " + i + " - New thread");
		}

		System.out.println("New Thread Completed");
	}

	public static void main(String[] args) {
		
		SimpleThread tt_1 = new SimpleThread();
		tt_1.start();

		SimpleThread tt_2 = new SimpleThread();
		tt_2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Count # " + i + " - Main thread");
		}

		System.out.println("Main Thread Completed");
	}
}
