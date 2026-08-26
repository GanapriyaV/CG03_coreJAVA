package com.tnsif.statickeyword;

//demo for static method
public class Staticmethod {
static int calculateBonus(int salary) {
	return salary*10/100;
}
public static void main(String[] args) {
	int bonus=Staticmethod.calculateBonus(30000);
	System.out.println("Bonus: "+bonus);
}
}
