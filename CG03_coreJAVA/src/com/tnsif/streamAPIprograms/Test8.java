package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//find the matching salary
public class Test8 {
public static void main(String[] args) {
	List<Integer> s=Arrays.asList(30000,450000,70000,80000,345,6000,2000000,2455680);
	boolean r=s.stream().filter(salary->salary>1000).anyMatch(salary->salary<1000);
	System.out.println("salary found: "+r);
}
}
