package com.tnsif.abstraction;

abstract class Webseries{
	abstract void Series(String name);
}

class SeriesGenre extends Webseries{

	@Override
	void Series(String name) {
		String seriesname="East Palace";
		System.out.println("Loading the series...");
		System.out.println("Series Name: "+seriesname);
		System.out.println("Genre of Series: "+name);	
	}
	
}
public class Series {
public static void main(String[] args) {
	SeriesGenre s=new SeriesGenre();
	s.Series("Horror");
}
}
