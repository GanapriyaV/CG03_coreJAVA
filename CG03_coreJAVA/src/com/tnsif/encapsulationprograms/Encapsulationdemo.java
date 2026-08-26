package com.tnsif.encapsulationprograms;

import java.util.Scanner;

//demo for encapsulation
class BankAccount{
	
	private String AccountHolder;
	private double balance;

	public BankAccount(String accountHolder, double balance) {
		super();
		AccountHolder = accountHolder;
		this.balance = balance;
	}

	public String getAccountHolder() {
		return AccountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		AccountHolder = accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println("amount deposit successfully");
		}
		else {
			System.out.println("invalid amount");
		}
	}

	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance=balance-amount;
			System.out.println("amount withdraw succefully");
		}
		else {
			System.out.println("invalid amount or insuffienet balance");
		}
	}
	public void display() {
		System.out.println("account holder "+AccountHolder);
		System.out.println("Balance "+balance);
	}
	
}

public class Encapsulationdemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account holder name :");
		String name=sc.nextLine();
		
		System.out.println("Enter intial balance :");
		double balance=sc.nextInt();
		
		BankAccount b=new BankAccount(name,balance);
		
		b.display();
		
		System.out.println("Enter amount to deposit");
		double depositamount=sc.nextDouble();
		b.deposit(depositamount);
		
		System.out.println("Enter amount to withdraw");
		double withdraw=sc.nextDouble();
		b.withdraw(withdraw);
		
		System.out.println("Final Balance "+b.getBalance());
		sc.close();
		
	}
}
