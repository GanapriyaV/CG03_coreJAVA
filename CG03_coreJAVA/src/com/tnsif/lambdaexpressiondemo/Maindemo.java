package com.tnsif.lambdaexpressiondemo;

interface greet{
	void print();
}
public class Maindemo {
public static void main(String[] args) {
	greet s=()->{System.out.println("hello");};
	s.print();
}
}
