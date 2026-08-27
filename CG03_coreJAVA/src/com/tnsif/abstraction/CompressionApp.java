package com.tnsif.abstraction;

abstract class FileCompressor{
	abstract void compress(String filename);
	
	void showdetails() {
		System.out.println("Compression started..");
	}
}

class ZipCompressor extends FileCompressor{

	@Override
	void compress(String filename) {
		System.out.println("Compressing using Zip...");
		int originalsize=100;
		int compressedsize=originalsize*60/100;
		System.out.println("Original Size: "+originalsize+" MB");
		System.out.println("Compressed Size: "+compressedsize+" MB");
	}
}

class GzipCompressor extends FileCompressor{

	@Override
	void compress(String filename) {
		System.out.println("Compressing using Zip...");
		int originalsize=150;
		int compressedsize=originalsize*50/100;
		System.out.println("Original Size: "+originalsize+" MB");
		System.out.println("Compressed Size: "+compressedsize+" MB");
	}
}

public class CompressionApp {
public static void main(String[] args) {
	ZipCompressor z=new ZipCompressor();
	z.compress("Project.zip");
	System.out.println();
	
	GzipCompressor g=new GzipCompressor();
	g.compress("Project.zip");
}
}
