package com.tnsif.polymorphism;

class Vehicle{
	void start() {
		System.out.println("Vehicle is starting");
	}
}

class Car extends Vehicle{
	@Override
	void start() {
		System.out.println("Car starts with a key");
	}
}

class Bike extends Vehicle{
	@Override
	void start() {
		System.out.println("Bike starts with a self-start");
	}
}

public class Demo {
public static void main(String[] args) {
	
	Vehicle v=new Vehicle();
	Vehicle c=new Car();
	Vehicle b=new Bike();
	v.start();
	c.start();
	b.start();
}
}
