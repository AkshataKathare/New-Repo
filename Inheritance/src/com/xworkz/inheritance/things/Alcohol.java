package com.xworkz.inheritance.things;

public class Alcohol {
	private String brand;

	public Alcohol() {
		System.out.println("No-arg constructor in Alcohol");
	}

	public Alcohol(String brand) {
		this.brand = brand;
		System.out.println("String in Alcohol");
	}

	public String getBrand() {
		return brand;
	}

}
