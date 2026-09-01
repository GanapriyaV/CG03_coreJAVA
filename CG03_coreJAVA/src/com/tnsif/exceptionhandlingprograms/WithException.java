package com.tnsif.exceptionhandlingprograms;

public class WithException {
	public static void main(String[] args) {
		System.out.println("Good morning all");
		int a=90;
		int b=0;
		System.out.println("Welcome to java");
		try {
		System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Hello world");
	}

}
