package com.xworkz.association.things;

public class Area {
	public final String name = "Gandhi Chowk";
	public double population;
	public int street;

	public void setPopulation(double population) {
		this.population = population;
	}

	public void setStreet(int street) {
		this.street = street;
	}

	public void show() {
		System.out.println("Details of Area..");
		System.out.println(this.name);
		System.out.println(this.population);
		System.out.println(this.street);
	}

}
