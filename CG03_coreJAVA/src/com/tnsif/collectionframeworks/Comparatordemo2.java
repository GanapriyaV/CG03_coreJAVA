package com.tnsif.collectionframeworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Book{
	String category;
	int price;
	
	public Book(String category, int price) {
		super();
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [category=" + category + ", price=" + price + "]";
	}	
}

class BookComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		//first sort by category
		int result = o1.category.compareTo(o2.category);
		//if category is same, sort by price
		if(result==0) {
			result=o1.price-o2.price;
		}
		return result;
	}
	
}

public class Comparatordemo2 {
public static void main(String[] args) {
	List<Book> p=new ArrayList<>();
	p.add(new Book("Java", 500));
	p.add(new Book("Python", 300));
	p.add(new Book("Java", 250));
	p.add(new Book("Python", 450));
	p.add(new Book("C++", 400));
	
	Collections.sort(p, new BookComparator());
	for(Book e:p) {
		System.out.println(e);
	}
}
}
