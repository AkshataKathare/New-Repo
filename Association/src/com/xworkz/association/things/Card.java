package com.xworkz.association.things;

public class Card {
	public String name;
	public double balance;

	public Card() {
		System.out.println("No-arg constructor of Card");
	}

	public Card(String name, double balance) {
		this.name = name;
		this.balance = balance;
		System.out.println("String,double constructor of Card");

	}

	public void display() {
		System.out.println("Details of Card ..");
		System.out.println(this.name);
		System.out.println(this.balance);

	}

}
