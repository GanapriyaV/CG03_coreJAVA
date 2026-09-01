package com.tnsif.exceptionhandlingprograms;

public class Throwdemo2 {
static void CheckPassword(String password) {
	if (password.length()<6) {
		throw new IllegalArgumentException("Password is too short..");
	}
	System.out.println("Password accepted");
}

public static void main(String[] args) {
	try {
		CheckPassword("abcdefghijk");
	}
	catch(IllegalArgumentException i) {
		System.out.println(i.getMessage());
	}
}
}
