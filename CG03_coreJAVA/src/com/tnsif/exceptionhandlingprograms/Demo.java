package com.tnsif.exceptionhandlingprograms;

public class Demo {
public static void main(String[] args) {
	String Employeename="Rahul";
	String Department=null;
	String Designation="Developer";
	
	try {
		System.out.println("Employee: "+Employeename);
		System.out.println("Designation: "+Designation);
		System.out.println("Department: "+Department.toUpperCase());
	}
	catch(NullPointerException r) {
		System.out.println(r);
		System.out.println("Department Information is missing...");
		
	}
	
	System.out.println("Program continue......");
}
}
