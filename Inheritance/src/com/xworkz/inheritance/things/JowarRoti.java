package com.xworkz.inheritance.things;

public class JowarRoti extends ButterRoti {
	private double price;

	public JowarRoti() {
		System.out.println("No-arg constructor in JowarRoti");
	}

	public JowarRoti(double price) {
		this.price = price;
		System.out.println("double in JowarRoti");
	}

	public double getPrice() {
		return this.price;
	}

}
