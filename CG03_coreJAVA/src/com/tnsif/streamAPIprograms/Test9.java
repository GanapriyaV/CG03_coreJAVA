package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//find employees who are in IT department, salary, and the names (intermediate process)
class Employee{
	private int id;
	private String name;
	private String department;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Employee(int id, String name, String department, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
}
public class Test9 {
public static void main(String[] args) {
	List<Employee> e=Arrays.asList(new Employee(101,"Guru","IT",70000),
			new Employee(102,"Uma","IT",43499),
			new Employee(103,"Priya","IT",65000),
			new Employee(104,"raya","marketing",35000),
			new Employee(105,"gana","IT",68000),
			new Employee(106,"Preethi","HR",53000),
			new Employee(107,"jahnavi","IT",34045),
			new Employee(108,"manu","Finance",450000),
			new Employee(109,"kirthi","IT",59000));
	List<String> r=e.stream().filter(employee->employee.getDepartment().equals("IT"))
			.filter(employee->employee.getSalary()>50000)
			.map(employee->employee.getName())
			.sorted().toList();
	System.out.println("Employee name: "+r);
}
}
