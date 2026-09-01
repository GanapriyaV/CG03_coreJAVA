package com.tnsif.exceptionhandlingprograms;

public class ArrayIndexdemo {
public static void main(String[] args) {
	int marks[] = {80,90,75,60,39};
	try {
		System.out.println(marks[2]);
		System.out.println(marks[7]);
		System.out.println(marks[1]);
	}
	catch(ArrayIndexOutOfBoundsException t) {
		System.out.println(t.getMessage());
	}
	System.out.println("Program Continued....");
}
}
