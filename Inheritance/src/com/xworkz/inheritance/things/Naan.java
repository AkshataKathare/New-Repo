package com.xworkz.inheritance.things;

public class Naan extends ButterRoti {

	private double diameter;

	public Naan() {
		System.out.println("No-arg constructor in Naan");
	}

	public Naan(double diameter) {
		this.diameter = diameter;
		System.out.println("double in diameter");
	}

	public double getDiameter() {
		return this.diameter;
	}

}
