package com.skilledmonster.examples.thread;

public class SimpleThreadRunnableSleep implements Runnable {
	
	public void run() {
		Thread t = Thread.currentThread() ;
		
	
		for (int i = 0; i < 10; i++) {
			if(t.getName().equals("Thread - 1")) {
				try {
					Thread.sleep(2000) ; // it iwll definitely wait for 2 seconds
					t.wait(2000) ; // it not guarantee 
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println(  "Count # " + i + " - New thread - " + t.getName());
		}
		System.out.println(t.getName() +" Completed");
	}

	public static void main(String[] args) {
		
		SimpleThreadRunnableSleep tt_1 = new SimpleThreadRunnableSleep();
		Thread thread_1 = new Thread(tt_1);
		thread_1.setName("Thread - 1") ;
		thread_1.setPriority(1) ;
		thread_1.start();
		
		SimpleThreadRunnableSleep tt_2 = new SimpleThreadRunnableSleep();
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
