package com.tnsif.abstraction;

abstract class Notification{
	abstract void sendMessage(String message);
}

class EmailNotification extends Notification{

	@Override
	void sendMessage(String message) {
		String email="gana9084@gmail.com";
		System.out.println("sending email....");
		System.out.println("To:  "+email);
		System.out.println("Message: "+message);
		int messagelenght=message.length();
		System.out.println("Message length: "+messagelenght);
	}
}

public class Notificationdemo {
public static void main(String[] args) {
	EmailNotification e=new EmailNotification();
	e.sendMessage("Your Project is Approved");
}
}
