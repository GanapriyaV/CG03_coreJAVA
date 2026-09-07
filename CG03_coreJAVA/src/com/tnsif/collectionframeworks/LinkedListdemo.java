package com.tnsif.collectionframeworks;

import java.util.LinkedList;

public class LinkedListdemo {
public static void main(String[] args) {
	
	LinkedList<String> l=new LinkedList<>();
	
	l.add("google");
	l.add("youtube");
	l.add("github");
	l.add("python");
	l.add("java");
	
	System.out.println(l);
	
	l.addFirst("sql");
	l.addLast("postgresql");
	
	System.out.println("First "+l.peekFirst());//view fist without removing
	
	System.out.println(l);
	
	for(String o:l) {
		System.out.println(o);
	}
	System.out.println("Remove "+l.pollFirst());//remove first
}
}
