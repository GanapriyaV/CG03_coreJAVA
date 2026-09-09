package com.tnsif.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//demo for Comparator Interface
class Person{
	
	String name;
	int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void display() {
		System.out.println("Name: "+name+" age: "+age);
	}
}

//sort by name
class NameComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
	
		return o1.name.compareTo(o2.name);
	}	
}

//sort by age
class AgeComparator implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		
		return Integer.compare(o1.age, o2.age);
	}
	
}
public class Comparatorinterfacedemo {
public static void main(String[] args) {
	List<Person> l=new ArrayList<>();
	l.add(new Person("John", 30));
	l.add(new Person("Rohan", 80));
	l.add(new Person("Guru", 20));
	l.add(new Person("Tulsi", 50));
	
	//sort by name
	Collections.sort(l, new NameComparator());
	System.out.println("sorted by name: ");
	for(Person s:l) {
		s.display();;
	}
	
	//sort by age
	Collections.sort(l, new AgeComparator());
	System.out.println("Sorted by name: ");
	for(Person s:l) {
		s.display();
	}
}
}
