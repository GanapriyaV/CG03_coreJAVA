package com.tnsif.multitreadingprograms;

//demo for synchronization
class Account{
	int balance=10000;
	synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName()+" is depositing "+amount);
		int currentbalance=balance;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e){
			System.out.println(e);
		}
		balance=currentbalance+amount;
		
		System.out.println(Thread.currentThread().getName()+" Completed Balance= "+balance);
	}
}

class DepositTask implements Runnable{
	Account account;
	
	//constructor
	DepositTask(Account account){
		this.account=account;
	}

	@Override
	public void run() {
		account.deposit(500);
	}
	
}
public class Synchronizationdemo {
	public static void main(String[] args) {
		Account account=new Account();
		DepositTask d=new DepositTask(account);
		
		Thread d1=new Thread(d, "thread-1");
		Thread d2=new Thread(d, "thread-2");
		
		d1.start();
		d2.start();
	}
}
