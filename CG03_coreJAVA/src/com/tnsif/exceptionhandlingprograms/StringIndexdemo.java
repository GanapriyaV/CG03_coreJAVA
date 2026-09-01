package com.tnsif.exceptionhandlingprograms;

public class StringIndexdemo {
public static void main(String[] args) {
	String name="Java";
	try {
		System.out.println(name.charAt(0));
		System.out.println(name.charAt(3));
		System.out.println(name.charAt(9));
		System.out.println("welcome"); //this message won't print 
	}
	catch(Exception p) {
		System.out.println(p.getMessage());
	}
	System.out.println("Program Continued.....");
}
}
