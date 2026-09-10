package com.tnsif.lambdaexpressiondemo;

//demo for without lambda expression
interface Drawable{
	public void draw();
}

class Test implements Drawable{
int width=20;
	@Override
	public void draw() {
		System.out.println("Drawin: "+width);
		
	}
	
}
public class Withoutlambda {
	public static void main(String[] args) {
		Drawable d=new Test();
		d.draw();
	}

}
