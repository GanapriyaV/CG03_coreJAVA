package com.tnsif.multitreadingprograms;

class Whatps implements Runnable{

	@Override
	public void run() { //runnable state
		for(int i=0;i<5;i++) {
		System.out.println("Eclipse id: "+" "+Thread.currentThread().getId());
	}
	}
	
}
public class Implementingrunnable {
public static void main(String[] args) {
	Whatps w=new Whatps();
	Thread obj=new Thread(w); //new state
	obj.start();			  //running state
	System.out.println("Main id: "+" "+Thread.currentThread().getId());
}
}
