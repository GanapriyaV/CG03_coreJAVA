package com.tnsif.superprograms;

class Employee1{
	void calculatePerformance() {
		System.out.println("Calculating employee performance: ");
	}
}

class SeniorEmploye1 extends Employee1{
	void calculatePerformance() {
		super.calculatePerformance();
		System.out.println("Calculating leadership performance: ");
	}
}

public class Supermethod {
public static void main(String[] args) {
	SeniorEmploye1  n=new SeniorEmploye1();
	n.calculatePerformance();
}
}
 