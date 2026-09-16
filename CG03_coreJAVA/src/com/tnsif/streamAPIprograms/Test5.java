package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

public class Test5 {
public static void main(String[] args) {
	List<String> p=Arrays.asList("Laptop","Mobile","Tablet","Lipstick","keyboard");
	List<String> result=p.stream().limit(3).toList();
	System.out.println("Product names: "+result);
}
}
