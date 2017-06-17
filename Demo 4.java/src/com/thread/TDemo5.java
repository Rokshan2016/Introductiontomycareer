
package com.thread;

public class TDemo5 extends Thread{

	@Override
	public void run() {

		for(int i=0;i<1000;i++){
			System.out.println("TDemo5 : "+i);

		}
		// 5 sec - get ur balance
	}

	
	
}
