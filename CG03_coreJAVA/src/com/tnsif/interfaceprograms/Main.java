package com.tnsif.interfaceprograms;

//interface demo
interface Payment{
	void pay(double amount); //abstract method
		void checkStatus();
}

class UPI implements Payment{

	@Override
	public void pay(double amount) {
		System.out.println("paid "+amount+" using UPI");	
	}

	@Override
	public void checkStatus() {
		System.out.println("UPI Payment Successfull");
	}
	
}
public class Main {
public static void main(String[] args) {
	UPI u=new UPI();
	u.pay(1500.90);
	u.checkStatus();
}
}
