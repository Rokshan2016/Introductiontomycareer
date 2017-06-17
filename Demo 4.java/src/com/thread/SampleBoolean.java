package com.thread;

public class SampleBoolean {
	
	
	public static class ThreadDemo implements Runnable {

	   public void run() {
	   
	   Thread t = Thread.currentThread();
	   // tests if this thread is alive
	   System.out.println("status = " + t.isAlive());
	   }

	   public static void main(String args[]) throws Exception {

	   Thread t = new Thread(new ThreadDemo());
	   // this will call run() function
	   t.start();
	   // waits for this thread to die
	   t.join();
	   // tests if this thread is alive
	   System.out.println("status = " + t.isAlive());
	   }
	   
	}


}