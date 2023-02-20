package com.xworkz.inheritance.hashCode.things;

public class Coconut {
	private double cost;
	private boolean sweet;
	private String color;
	private double length;

	public Coconut() {
		System.out.println("No-arg constructor in Coconut..");
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Coconut");
		return "Cost :" + this.cost + "\nIt is sweet :" + this.sweet + "\nColor :" + this.color + "\nLength :"
				+ this.length;
	}
	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Coconut");
		return 1000;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getCost() {
		return cost;
	}

	public String getColor() {
		return color;
	}

	public double getLength() {
		return length;
	}

	public boolean isSweet() {
		return sweet;
	}

}
