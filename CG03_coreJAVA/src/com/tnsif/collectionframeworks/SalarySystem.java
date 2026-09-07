package com.tnsif.collectionframeworks;

import java.util.TreeSet;

public class SalarySystem {
public static void main(String[] args) {
	TreeSet<Integer> t=new TreeSet<>();
	
	t.add(25000);
	t.add(250000);
	t.add(200000);
	t.add(35000);
	t.add(500000);
	t.add(70000);
	t.add(80000);
	
	System.out.println("Salaries: "+t);
	System.out.println("Total Salary: "+t.size());
	
	System.out.println("Contains 50000 ? "+t.contains(50000));
	
	//lowest salary
	System.out.println("Lowest Salary: "+t.first());
	System.out.println(t.last());
	
	System.out.println(t.headSet(50000));//below
	System.out.println(t.tailSet(50000));//above
	System.out.println(t.subSet(3000, 60000));//between
	
}
}
