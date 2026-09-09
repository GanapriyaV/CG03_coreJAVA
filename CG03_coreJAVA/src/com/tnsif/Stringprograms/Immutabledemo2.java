package com.tnsif.Stringprograms;

public class Immutabledemo2 {
	public static void main(String[] args) {
		String s1="Sachin"; //literal
		
		String str=new String("hello");//new keyword -> heap memory(memory storage)
		System.out.println(str);
		str=str.concat(" welcome to java");//need to assign explicitly new key word to concate the string value
		System.out.println(str);
		
		String s2=s1;
		String s3=s2;
		
		System.out.println("Befor Modification: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println("s3: "+s3);
		
		s1="tendulkar";
		
		System.out.println("After Modification: ");
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2); 
		System.out.println("s3: "+s3);
	}
	
}
