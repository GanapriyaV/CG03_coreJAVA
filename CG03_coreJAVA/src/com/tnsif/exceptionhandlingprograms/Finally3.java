package com.tnsif.exceptionhandlingprograms;

public class Finally3 {
	public static void main(String[] args) {
		try {
			System.out.println("Hello");
		}
		catch(Exception j) {
			System.out.println(j.getMessage());
		}
		finally {
			System.out.println("Welcome to world");
		}
	}
}
