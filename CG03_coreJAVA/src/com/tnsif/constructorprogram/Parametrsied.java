package com.tnsif.constructorprogram;

import java.util.Scanner;

class Employee1 {
	int id;
	String name;
	String department;
	double salary;
	
	//parametrised constructor
	Employee1(int id, String name, String department, double salary){
		this.id=id;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	void displayinfo() {
		System.out.println("Employee details:");
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee department: "+department);
		System.out.println("Employee salary: "+salary);
	}
}

public class Parametrsied {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the id: ");
	int id=sc.nextInt();
	sc.nextLine();
	
	System.out.println("Enter Employee name: ");
	String name=sc.nextLine();
	
	System.out.println("Enter the  department: ");
	String department=sc.nextLine();
	
	System.out.println("Enter the salary: ");
	double salary=sc.nextDouble();
	
	Employee1 e=new Employee1(id,name,department,salary);
	e.displayinfo();
	sc.close();
	}

}
