package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//finding customer name and city (terminate process)
class Customer{
	private String name;
	private String city;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Customer(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}	
}

public class Test10 {
public static void main(String[] args) {
	List<Customer> c=Arrays.asList(new Customer("Manish","Bangalore"),
			new Customer("Jaya","Chennai"),
			new Customer("Dev","Bangalore"),
			new Customer("Seema","Mumbai"),
			new Customer("siri","HYD"),
			new Customer("Harika","Jaipur"),
			new Customer("Riya","Bangalore"));
	c.stream().filter(c1->c1.getCity().equals("Bangalore")).forEach(c1->System.out.println(c1.getName()+" "+c1.getCity()));
}
}
