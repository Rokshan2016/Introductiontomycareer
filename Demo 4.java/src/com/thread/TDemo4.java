package com.thread;

public class TDemo4 extends Thread{

	
	
	
	@Override
	public void run() {

		for(int i=0;i<1000;i++){
			System.out.println("TDemo4 : "+i);

		}
	}
	
//1 hr		
		
	
	
	public static void main(String[] args) {
		
		TDemo4 demo1 = new TDemo4();
		TDemo5 demo2 = new TDemo5();
		TDemo6 demo3 = new TDemo6();
		
		demo1.start();// a new thread will start
		demo2.start();
		demo3.start();
		
		//Thread
	}
}
		