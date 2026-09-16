package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//sort
public class Test3 {
public static void main(String[] args) {
	List<Integer> a=Arrays.asList(20,80,56,89,78,543,349);
	a.stream().sorted().forEach(number->System.out.println(number));
}
}

