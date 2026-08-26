package com.tnsif.encapsulationprograms;

class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	Employee(int employeeId, String employeeName, double salary, String department){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.salary=salary;
		this.department=department;
	}
	
	//Getters
	public int getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public String getDepartment() {
        return department;
    }

    // Setters
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        salary = salary + (salary * percentage / 100);
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Department    : " + department);
        System.out.println("Salary        : " + salary);
        System.out.println();
    }
}
public class Employeemain {
	public static void main(String[] args) {

        // Creating objects using constructor
        Employee emp1 = new Employee(101, "Sam", 40000, "IT");
        Employee emp2 = new Employee(102, "Priya", 35000, "HR");

        System.out.println("Employee Details:");
        System.out.println();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Increasing Rahul's salary by 10%
        emp1.increaseSalary(10);

        System.out.println("After Salary Increase:");
        System.out.println();

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
