package com.tnsif.statickeyword;
//demo for static block

public class Staticblockdemo {
static int employeecount;

static {
	employeecount=100;
	System.out.println("Employee system initalized");
}

public static void main(String[] args) {
	System.out.println("Starting employee system...");
	System.out.println("Employee count: "+employeecount);
}
}
