package com.tnsif.superprograms;

class Person{
	String name;
	Person(String name){
		this.name=name;
		System.out.println("Person constructor");
	}
}

class Student extends Person{
	int rollno;
	Student(String name, int rollno){
		super(name);
		this.rollno=rollno;
		System.out.println("Student Constructor");
	}
	
}
public class Superconstructor {
public static void main(String[] args) {
	Student s=new Student("Rahul", 101);
	System.out.println(s.name);
	System.out.println(s.rollno);
}
}
