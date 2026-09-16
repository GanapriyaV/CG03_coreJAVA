package com.tnsif.streamAPIprograms;

import java.util.Arrays;
import java.util.List;

//displaying items price is greater than equals to 5000
class Products{
	private int id;
	private String items;
	private double price;
	
	public Products(int id, String items, double price) {
		super();
		this.id = id;
		this.items = items;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

public class Test11 {
public static void main(String[] args) {
	List<Products> p=Arrays.asList(new Products(1,"Laptop",26000),
			new Products(2, "adaptor",200),
			new Products(3, "Smart phone", 10000),
			new Products(4, "Headphone",2500),
			new Products(5, "Tv", 7000),
			new Products(6, "Oven", 5000),
			new Products(7, "Heater", 5500));
	p.stream().filter(p1->p1.getPrice()>5000).forEach(p1->System.out.println(p1.getItems()));
	}
}
