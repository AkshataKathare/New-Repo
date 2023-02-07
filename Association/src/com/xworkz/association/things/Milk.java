package com.xworkz.association.things;

public class Milk {

	public String name;
	public int expiryDate;

	public Milk() {
		System.out.println("No-arg constructor of Milk..");
	}

	public Milk(String name, int expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
		System.out.println("String,int constructor of Milk..");

	}

	public void display() {
		System.out.println(this.name);
		System.out.println(this.expiryDate);
	}

}
