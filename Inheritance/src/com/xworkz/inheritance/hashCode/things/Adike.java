package com.xworkz.inheritance.hashCode.things;

public class Adike {
	private String brand;
	private double diameter;
	private float cost;
	private boolean costly;

	public Adike() {
		System.out.println("No-arg constructor in Adike..");
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setCostly(boolean costly) {
		this.costly = costly;
	}

	public String getBrand() {
		return brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public float getCost() {
		return cost;
	}

	public boolean isCostly() {
		return costly;
	}

}
