package com.tnsif.exceptionhandlingprograms;

public class Throwsdemo {
static void calculate(int a, int b)throws ArithmeticException{
	int result = a/b;
	System.out.println("Result: "+result);
}
public static void main(String[] args) {
	try {
		calculate(10,7);
	}
	catch(ArithmeticException e) {
		System.out.println("cannot divided by zero");
	}
}
}
