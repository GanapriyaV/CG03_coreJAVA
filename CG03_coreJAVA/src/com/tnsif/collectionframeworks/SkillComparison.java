package com.tnsif.collectionframeworks;

import java.util.HashSet;

public class SkillComparison {
public static void main(String[] args) {
	HashSet<String> h=new HashSet<>();
	
	h.add("java");
	h.add("Git");
	h.add("SQL");
	h.add("Spring");
	h.add("Docker");
	
	System.out.println(h);
	
	HashSet<String> i=new HashSet<>();
	
	i.add("Python");
	i.add("AWS");
	i.add("SQL");
	i.add("GIT");
	
	System.out.println(i);
	
	//create a copy of h skills
	HashSet<String> common=(HashSet<String>) h.clone();
	System.out.println(common);
	
	//keep only skills available in both teams
	common.retainAll(i);
	System.out.println("Common skills: "+common);
	
	//create a another copy of team h
	HashSet<String> onlyJava=(HashSet<String>) h.clone();
	System.out.println(onlyJava);
	
}
}
