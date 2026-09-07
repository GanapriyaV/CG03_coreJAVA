package com.tnsif.collectionframeworks;

import java.util.ArrayList;

public class ArrayListdemo {
public static void main(String[] args) {
	//object creation
	
	ArrayList<String> p=new ArrayList<>();
	//add
	p.add("Laptop");
	p.add("Headphones");
	p.add("Headphones");
	p.add(null);//null values are accepted
	p.add("Mobile");
	p.add("Headphones");//duplicate values are also accepted
	p.add("Headphones");
	p.add("Headphones");
	p.add("Headphones");
	
	System.out.println("product 1: "+p.get(1));
	
	System.out.println("contains mobile ?"+p.contains("Mobile"));
	
	//no of elements
	System.out.println(p.size());
	p.remove("Headphones");//deleting headphones
	System.out.println(p);//displaying all items
	
	for(String i:p) {
		System.out.println(i);
	}
}
}
