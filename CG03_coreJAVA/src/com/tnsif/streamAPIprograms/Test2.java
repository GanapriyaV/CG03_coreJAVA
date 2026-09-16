package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//map() + toList()
public class Test2 {
public static void main(String[] args) {
	List<String> names=Arrays.asList("rahul","priya","amith","ram");
	List<String> uppernames=names.stream().map(name->name.toUpperCase()).toList();
	System.out.println("All converted: "+uppernames);
}
}

