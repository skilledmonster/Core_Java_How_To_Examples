package com.skilledmonster.examples.thread;

public class SimpleThreadRunnableMain implements Runnable  {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Count # " + i + " - New thread - ");
		}
		System.out.println("New Thread Completed");
	}

	public static void main(String[] args) {

		SimpleThreadRunnableMain tt_1 = new SimpleThreadRunnableMain();
		Thread thread_1 = new Thread(tt_1);
		thread_1.start();

		SimpleThreadRunnableMain tt_2 = new SimpleThreadRunnableMain();
		Thread thread_2 = new Thread(tt_2);
		thread_2.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Count # " + i + " - Main thread");
		}

		System.out.println("Main Thread Completed");
	}
}
