package com.xworkz.inheritance.things;

public class Kulcha extends Naan {

	private boolean tasty;

	public Kulcha() {
		System.out.println("No-arg constructor in Kulcha");
	}

	public Kulcha(boolean tasty) {
		this.tasty = tasty;
	}

	public boolean getTasty() {
		return this.tasty;
	}

}
