package com.xworkz.association.things;

public class Fridge {

	public String company;
	public double cost;
	public Milk milk;

	public Fridge() {
		System.out.println("No-arg constructor of Fridge..");
	}

	public Fridge(String company, double cost) {
		this.company = company;
		this.cost = cost;
		System.out.println("String,double construuctor of Fridge...");
	}

	public void init(Milk milk) {
		this.milk = milk;
	}

	public void display() {
		System.out.println("Details of Fridge..");
		System.out.println(this.company);
		System.out.println(this.cost);
		if (milk != null) {
			this.milk.display();
		} else {
			System.err.println("milk is not pointing to any memory..");
		}

	}

}
