package com.tnsif.exceptionhandlingprograms;

public class Arithematicdemo {
public static void main(String[] args) {
	int salary=5000;
	int workingdays=25;
	int bonusdays=5;
	
	try {
		int dailysalary=salary/workingdays;
		System.out.println("Daily salary: "+dailysalary);
		
		int bonusperday=salary/0;
		System.out.println("Bonus Salary: "+bonusperday);
	}
	catch(ArithmeticException e) {
		System.out.println("Cannot calculate salary bonus...");
		System.out.println(e.getMessage());
	}
	
	System.out.println("Salary Processing completed...");
}
}
