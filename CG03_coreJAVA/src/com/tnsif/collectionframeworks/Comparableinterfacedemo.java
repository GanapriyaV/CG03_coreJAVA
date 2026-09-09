package com.tnsif.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;

//demo for comparable interface (Single sorting sequence)
class Student implements Comparable<Student>{
	
	int marks;
	String name;
	
	//constructor
	public Student(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	
	//ComapreTo method
	//@Override
	//public int compareTo(Student o) {
		
	//	return this.marks-o.marks;//integer
	//}
	
	//toString method
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		//String 
		//return this.name.compareTo(o.name);//descending order
		return o.name.compareTo(this.name);//ascending order
	}
	
}
public class Comparableinterfacedemo {
public static void main(String[] args) {
	ArrayList<Student> s=new ArrayList<>();
	s.add(new Student (85, "Rahul"));
	s.add(new Student (90, "Kushi"));
	s.add(new Student (70, "Prithvi"));
	s.add(new Student (95, "Kuhal"));
	
	Collections.sort(s);
	for(Student i:s) {
		System.out.println(i);
	}
}
}
