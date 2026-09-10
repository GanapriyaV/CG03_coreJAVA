package com.tnsif.lambdaexpressiondemo;

interface Square{
	int calculatearea(int a);
}
public class Area {
public static void main(String[] args) {
	Square s=(a)->{
		int area=a*a;
		System.out.println("Area= "+area);
		return area;
				};
	s.calculatearea(6);
}
}
