package com.tnsif.polymorphism;

//demo for method overriding
class BankAccount{
	void calculateinterest(double amount) {
		System.out.println("Calculating standard bank interest");
		System.out.println("Amount: "+amount);
	}
}

class SavingAccount extends BankAccount{
	@Override
	void calculateinterest(double amount) {
		double interest=amount*0.04;
		System.out.println("Saving account");
		System.out.println("Principal: "+amount);
		System.out.println("Interest: "+interest);
	}
}

class FixedDeposit extends BankAccount{
	@Override
	void calculateinterest(double amount) {
		double interest=amount*0.07;
		System.out.println("Fixed deposit");
		System.out.println("Principal: "+amount);
		System.out.println("Interest: "+interest);
	}
}

class CurrentAccount extends BankAccount{
	@Override
	void calculateinterest(double amount) {
		System.out.println("Current account");
		System.out.println("no interest provided");
	}
}

public class Methodoverridingdemo {
public static void main(String[] args) {
	
	BankAccount a;
	a=new SavingAccount();
	a.calculateinterest(100000);
	System.out.println();
	
	a=new FixedDeposit();
	a.calculateinterest(100000);
	System.out.println();
	
	a=new CurrentAccount();
	a.calculateinterest(100000);
}
}
