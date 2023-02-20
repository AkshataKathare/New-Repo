package com.xworkz.inheritance.hashCode.things;

public class Pipe {

	private String color;
	private double cost;
	private float length;
	private String company;

	public Pipe() {
		System.out.println("No-arg constructor in Pipe..");
	}

	@Override
	public String toString() {
		System.out.println("over-riding toString in Pipe..");
		return "Color :" + this.color + "\nCost :" + this.cost + "\nLength :" + this.length + "\nCompany :"
				+ this.company;
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Pipe..");
		return 200;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getColor() {
		return color;
	}

	public double getCost() {
		return cost;
	}

	public float getLength() {
		return length;
	}

	public String getCompany() {
		return company;
	}

}
