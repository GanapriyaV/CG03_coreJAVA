package com.tnsif.Stringprograms;

public class Stringdemo {
public static void main(String[] args) {
	
	//creating a string
	String s="Hello Java Programming";
	
	//Length
	System.out.println("Length: "+s.length());
	
	//charAt()
	System.out.println("Character at the index 6: "+s.charAt(6));
	
	//toUppercase and toLowercase
	System.out.println("upper case: "+s.toUpperCase());
	System.out.println("Lower case: "+s.toLowerCase());
	
	//contains
	System.out.println(s.contains("java"));
	
	//starts with
	System.out.println(s.startsWith("word"));
	
	//ends with
	System.out.println(s.endsWith("hello"));
	
	System.out.println(s.substring(6, 10));
	System.out.println(s.replace("Java", "Python"));
}
}
