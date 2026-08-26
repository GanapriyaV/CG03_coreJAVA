package com.tnsif.polymorphism;

class Calculator{
	
	//area of circle
	void calculateArea(double radius) {
		double area=Math.PI*radius*radius;
		System.out.println("Area of circle: "+area);
	}
	
	//area of rectangle
	void calculateArea(double l, double b) {
		double area=l*b;
		System.out.println("Area of rectangle: "+area);
	}
	
	//area of square
	void calculateArea(int a) {
		int area=a*a;
		System.out.println("Area of sqaure: "+area);
	}
}
public class Area {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		c.calculateArea(5.5);
		c.calculateArea(3.0, 6.0);
		c.calculateArea(4);
	}
}
