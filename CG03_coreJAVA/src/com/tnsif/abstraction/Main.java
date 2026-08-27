package com.tnsif.abstraction;

abstract class Employee{
	String name;
	
	Employee(String name){
		this.name=name;
	}
	abstract double calculateSalary();
	
	void displayDetails() {
		System.out.println(name+ " Salary: " +calculateSalary());
	}
}

class FullTimeEmployee extends Employee{
	
	private double monthlySalary;
	
	FullTimeEmployee(String name, double monthlySalary){
		super(name);
		this.monthlySalary=monthlySalary;
	}
	
	@Override
	double calculateSalary() {
		return monthlySalary;
	}

}

class PartTimeEmployee extends Employee{
	
	private int hoursWorked;
	private double hourlyRate;

	PartTimeEmployee(String name, int hoursWorked, double hourlyRate) {
		super(name);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	
	@Override
	double calculateSalary() {
		return hoursWorked * hourlyRate;
	}
	
}

public class Main {
public static void main(String[] args) {
	
	Employee f=new FullTimeEmployee("Jay", 5000);
	Employee p=new PartTimeEmployee("Raya", 45, 30);
	f.displayDetails();
	p.displayDetails();
}
}
