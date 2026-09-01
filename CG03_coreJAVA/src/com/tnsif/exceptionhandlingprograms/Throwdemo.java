package com.tnsif.exceptionhandlingprograms;

public class Throwdemo {
static void CheckAge(int age) {
	if(age<18) {
		throw new ArithmeticException("Student is not eligible for voting");
	}
	System.out.println("Student is eligible for vote");
}
public static void main(String[] args) {
	try {
		CheckAge(16);
	}
	catch(ArithmeticException e) {
		System.out.println(e.getMessage());
	}
}
}
