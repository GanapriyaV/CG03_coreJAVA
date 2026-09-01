package com.tnsif.exceptionhandlingprograms;

public class NullPointerdemo {
public static void main(String[] args) {
	String str=null;
	try {
	System.out.println(str.length());
	}
	catch(NullPointerException n) {
		System.out.println(n);
	}
	System.out.println("Program Cotinued....");
}
}
