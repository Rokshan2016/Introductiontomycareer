package com.thread;

public class TDemo7 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread()+":"+i);
		}
	}

	public static void main(String[] args) {
		
		TDemo7 t7 = new TDemo7();
		//t7.start();
		Thread t1 = new Thread(t7);
		t1.start();
		Thread t2 = new Thread(new TDemo7());
		t2.start();
		Thread t3 = new Thread(new TDemo7());
		t3.start();
		
		
		
	}
	
}

