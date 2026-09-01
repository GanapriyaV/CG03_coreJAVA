package com.tnsif.exceptionhandlingprograms;

public class Throwsdemo2 {
static void Login(String username, String password)throws Exception{
	if(username.equals("admin")) {
		throw new Exception("Invalid username");
	}
	if(!password.equals("1234")) {
		throw new Exception("Invalid Password");
	}
	System.out.println("Login successfully");
}
public static void main(String[] args) {
	try {
		Login("gana","1234");
	}
	catch(Exception s){
		System.out.println(s.getMessage());
	}
	System.out.println("Login process completed");
}
}
