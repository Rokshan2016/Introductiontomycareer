package com.thread;

public class TDemo6 extends Thread {

	@Override
	public void run() {

		for(int i=0;i<1000;i++){
			System.out.println("TDemo6 : "+i);

		}
		
		// 10 mins
	}
	
}
