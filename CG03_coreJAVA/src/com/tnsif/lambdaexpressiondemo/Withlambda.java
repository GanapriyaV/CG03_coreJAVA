package com.tnsif.lambdaexpressiondemo;

//demo for with lambda expression
@FunctionalInterface
interface Draw{
	public void draw();
}

public class Withlambda {
public static void main(String[] args) {
	int width=20;
	Draw d2 = () -> {System.out.println("Draw: "+width);//lambda expression
};
d2.draw();
}
}
