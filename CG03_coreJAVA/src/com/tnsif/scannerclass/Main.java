package com.tnsif.scannerclass;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter your salary: ");
		double salary=sc.nextDouble();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
	}
}

