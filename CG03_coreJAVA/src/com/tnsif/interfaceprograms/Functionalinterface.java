package com.tnsif.interfaceprograms;

interface Count{
	int Sum(int a, int b);
}

public class Functionalinterface {
public static void main(String[] args) {
	Count Total= (a,b) -> a + b;
	System.out.println("Total: "+Total.Sum(10, 5));
}
}
