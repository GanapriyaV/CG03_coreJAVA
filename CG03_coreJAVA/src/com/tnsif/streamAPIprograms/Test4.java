package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//distinct(remove the duplicate values)
public class Test4 {
public static void main(String[] args) {
	List<Integer> n=Arrays.asList(12,58,67,7,342,112,675,98);
	long count=n.stream().distinct().count();
	System.out.println("Unique values: "+count);
}
}
