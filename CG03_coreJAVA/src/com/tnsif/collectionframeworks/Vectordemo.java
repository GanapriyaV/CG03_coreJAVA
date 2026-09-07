package com.tnsif.collectionframeworks;

import java.util.Vector;

public class Vectordemo {
public static void main(String[] args) {
	Vector<Integer> v=new Vector<>();
	
	v.add(1);
	v.add(45);
	v.add(50);
	v.add(78);
	v.add(8);
	v.add(65);
	v.add(0);
	
	System.out.println(v);
	
	v.capacity();
	System.out.println(v);
	
	v.contains(2);//checking the data contain 2 in the list
	System.out.println(v);
	
	v.removeFirst();
	System.out.println(v);
	
	for(Integer u:v) {
		System.out.println(u);
	}
	
	v.clear();
	System.out.println(v);
	
	}
}
