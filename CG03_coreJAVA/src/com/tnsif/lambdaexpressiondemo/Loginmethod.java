package com.tnsif.lambdaexpressiondemo;

import java.util.Scanner;

@FunctionalInterface
interface Loginvalidation{
	boolean validate(String username, String password);
}

public class Loginmethod {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the name: ");
	String username=sc.nextLine();
	
	System.out.println("Enter the password: ");
	String password=sc.nextLine();
	
	//Lambda expression
	Loginvalidation login=(user, pass)->{
		if(user.equals("admin")&&pass.equals("admin123")) {
			return true;
		}
		return false;
	};
	boolean result=login.validate(username, password);
	if(result) {
		System.out.println("login successful");
	}else {
		System.out.println("Invalid login");
	}
}
}
