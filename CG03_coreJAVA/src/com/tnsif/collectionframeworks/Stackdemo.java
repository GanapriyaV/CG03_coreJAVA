package com.tnsif.collectionframeworks;

import java.util.Stack;

public class Stackdemo {
public static void main(String[] args) {
	Stack<String> s=new Stack<>();
	
	s.push("Home");
	s.push("Table");
	s.push("chair");
	s.push("cycle");
	s.push("Laptop");
	s.push("Bike");
	s.push("bottle");
	
	System.out.println(s);
	
	s.peek();
	
	System.out.println("Search: "+s.search("Chair"));
	
	s.pop();
	for(String g:s) {
		System.out.println(g);
	}
	
	s.push("Glass");
	System.out.println(s);
	
	s.empty();
	System.out.println(s);
	
}
}
