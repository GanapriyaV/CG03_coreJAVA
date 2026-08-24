package encapsulationprograms;

class Employee{
	private int employeeId;
	private String employeeName;
	private double salary;
	private String department;
	
	Employee(int employeeId, String employeeName, double salary, String department){
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.department = department;	
	}
	
	public int getEWmployeeId() {
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
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	public void increaseSalary(double percentage) {
		salary = salary + (salary*percentage/100);
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+salary);
		System.out.println("Employee Department: "+department);
	}
}

public class Employeemain {
public static void main(String[] args) {
	Employee emp1 = new Employee(101, "Sam", 40000, "IT");
	Employee emp2 = new Employee(102, "Priya", 34000, "HR");
	
	System.out.println("Empoyee Details: ");
	System.out.println();
	
	emp1.displayEmployeeDetails();
	emp2.displayEmployeeDetails();
	
	emp1.increaseSalary(10);
	
	System.out.println("After Salary Increse: ");
	System.out.println();
	
	emp1.displayEmployeeDetails();
	emp2.displayEmployeeDetails();
	
}
}
