package com.skilledmonster.examples.thread;

public class SimpleThreadRunnable implements Runnable {
	
	public void run() {
		Thread t = Thread.currentThread() ;
		
		for (int i = 0; i < 10; i++) {
			System.out.println(  "Count # " + i + " - New thread - " + t.getName());
		}
		System.out.println(t.getName() +" Completed");
	}

	public static void main(String[] args) {
		
		SimpleThreadRunnable tt_1 = new SimpleThreadRunnable();
		Thread thread_1 = new Thread(tt_1);
		thread_1.setName("Thead - 1") ;
		thread_1.setPriority(1) ;
		thread_1.start();
		
		SimpleThreadRunnable tt_2 = new SimpleThreadRunnable();
		Thread thread_2 = new Thread(tt_2) ;
		thread_2.setName("Thread - 2") ;
		thread_2.setPriority(10) ;
		thread_2.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Count # " + i + " - Main thread");
		}
		
		System.out.println("Main Thread Completed");
	}
}
