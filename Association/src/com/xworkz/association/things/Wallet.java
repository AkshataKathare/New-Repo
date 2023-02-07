package com.xworkz.association.things;

public class Wallet {

	public boolean online;
	public String color;
	public Card card;

	public Wallet() {
		System.out.println("No-arg constructor of Wallet..");
	}

	public Wallet(boolean online, String color) {
		this.online = online;
		this.color = color;
		System.out.println("boolean,String constructor of Wallet");

	}

	public void init(Card card) {
		this.card = card;

	}

	public void display() {
		System.out.println("Details of Wallet");
		System.out.println(this.online);
		System.out.println(this.color);
		if (card != null) {
			this.card.display();
		} else {
			System.err.println("card is not pointing to any memory..");
		}
	}

}
