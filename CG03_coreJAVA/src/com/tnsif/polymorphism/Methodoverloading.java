package com.tnsif.polymorphism;

//demo for method overloading
class StudentResult{
	
	void calculateresult(int math, int java, int dbms) {
		int total=math+java+dbms;
		System.out.println("Total marks:"+total);
	}
	
	void calculateresult(int math, int python) {
		int total=math+python;
		System.out.println("Total marks:"+total);
	}
	
	void calculateresult(int totalmarks, double bonus) {
		double finalmarks=totalmarks+bonus;
		System.out.println("Final marks:"+finalmarks);
	}
}

public class Methodoverloading {
public static void main(String[] args) {
	StudentResult s=new StudentResult();
	s.calculateresult(70, 80, 85);
	s.calculateresult(90, 80);
	s.calculateresult(390, 5.0);
}
}
