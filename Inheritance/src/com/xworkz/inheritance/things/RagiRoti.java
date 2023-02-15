package com.xworkz.inheritance.things;

public class RagiRoti extends Roti {

	private double calorie;

	public RagiRoti() {
		System.out.println("No-arg constructor in RagiRoti");

	}

	public RagiRoti(double calorie) {
		this.calorie = calorie;
		System.out.println("double in RagiRoti");
	}

	public double getCalorie() {
		return this.calorie;
	}

}
