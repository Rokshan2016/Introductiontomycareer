package com.thread;

public class TDemo1 {

	public void A(){

		for(int i=0;i<1000;i++){
			System.out.println("TDemo1 : "+i);

		}
	}
	
	public static void main(String[] args) {
		
		TDemo1 demo1 = new TDemo1();
		TDemo2 demo2 = new TDemo2();
		TDemo3 demo3 = new TDemo3();
		
		
		
		demo1.A();
		demo2.A();
		demo3.A();
		
		//Thread
		
	}
	
}
