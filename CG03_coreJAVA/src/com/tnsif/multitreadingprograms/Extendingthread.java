package com.tnsif.multitreadingprograms;

//demo for multi-threading
class Eclipse extends Thread{
	public void run() { 
		System.out.println("Eclipse id: "+" "+Thread.currentThread().getId());
	}
}

class Onenote extends Thread{
	public void run() { //running state
		System.out.println("Onenote id: "+" "+Thread.currentThread().getId());
	}
}

class Chrome extends Thread{
	public void run() { 
		System.out.println("Chrome id: "+" "+Thread.currentThread().getId());
	}
}
public class Extendingthread {
public static void main(String[] args) {
	Eclipse e=new Eclipse(); //new state
	e.start(); //runnable state
	
	Onenote o=new Onenote();
	o.start();
	
	Chrome c=new Chrome();
	c.start();
	
	for(int i=0; i<=5; i++) {
		System.out.println("Main method Thread id: "+" "+Thread.currentThread().getId());
	}
}
}
