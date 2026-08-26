package com.tnsif.inheritanceprograms;

class Vehicle{
	String colour="black";
	void speed() {
		System.out.println("high speed");
	}
}

class Car extends Vehicle{
	void engine() {
		System.out.println("good");
	}
}

class Minicar extends Car{
	void show() {
		System.out.println("good speed");
	}
}
public class ML {
public static void main(String[] args) {
	Minicar m=new Minicar();
	m.speed();
	m.engine();
	m.show();
	Car c=new Car();
	c.speed();
}
}
