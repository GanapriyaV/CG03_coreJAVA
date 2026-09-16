package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//print multiples of 5
public class Test6 {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(3,5,12,15,20,33,25,30,45,50);
	numbers.stream().filter(n->n%5==0).forEach(System.out::println);
	}
}

