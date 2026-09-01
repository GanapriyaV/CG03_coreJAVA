package com.tnsif.exceptionhandlingprograms;

public class Finally {
public static void main(String[] args) {
	try {
		System.out.println(6/0);
	}
	catch(Exception j) {
		System.out.println(j.getMessage());
	}
	finally {
		System.out.println("Welcome to world");
	}
}
}
