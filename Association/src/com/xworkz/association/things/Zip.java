package com.xworkz.association.things;

public class Zip {
	public int length;
	public String color;

	public Zip() {
		System.out.println("No-arg constructor of Zip..");
	}

	public Zip(int length, String color) {
		this.length = length;
		this.color = color;
		System.out.println("int and String constructor in Zip");
	}

	public void display() {
		System.out.println("Details of Zip");
		System.out.println(this.length);
		System.out.println(this.color);
	}

}
