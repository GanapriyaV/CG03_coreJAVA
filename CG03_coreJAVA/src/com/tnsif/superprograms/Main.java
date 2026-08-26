package com.tnsif.superprograms;

class Employee{
	int salary=50000;
}

class Senioremployee extends Employee{
	int salary=80000;
	
	void displayinfo() {
		System.out.println("Senior employee salary: "+salary);
		System.out.println("Employee salary: "+super.salary);
	}
}

public class Main {
public static void main(String[] args) {
	Senioremployee s=new Senioremployee();
	s.displayinfo();
}
}
