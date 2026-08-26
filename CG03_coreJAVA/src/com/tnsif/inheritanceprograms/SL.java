package com.tnsif.inheritanceprograms;

class Father{
	int money=50000;
	String car="BMW";
	
	void read() {
		System.out.println("reading a news paper");
	}
}

class Son extends Father{
	String cycle="blue";
	
	void play() {
		System.out.println("Playing circket");
	}
}
public class SL {
public static void main(String[] args) {
	Son s=new Son();
	System.out.println(s.money);
	System.out.println(s.car);
	System.out.println(s.cycle);
	s.read();
	s.play();
}
}
