package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//skip (optional)
public class Test7 {
public static void main(String[] args) {
	List<String> p1=Arrays.asList("apple","banana","orange","pineapple","papaya");
	Optional<String> fruits=p1.stream().skip(5).findFirst();
	System.out.println(fruits.orElse("product not found"));
}
}
