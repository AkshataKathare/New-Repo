package com.xworkz.inheritance.hashCode.things;

public class SugarCane {

	private double length;
	private float diameter;
	private String color;
	private boolean sweet;

	public SugarCane() {
		System.out.println("No-arg constructor in SugarCane");
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in SugarCane..");
		return "Length :" + this.length + "\nDiameter :" + this.diameter + "\nColor :" + this.color + "\nIt is sweet :"
				+ this.sweet;
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in SugarCane..");
		return 150;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setSweet(boolean sweet) {
		this.sweet = sweet;
	}

	public float getDiameter() {
		return diameter;
	}

	public double getLength() {
		return length;
	}

	public String getColor() {
		return color;
	}

	public boolean isSweet() {
		return sweet;
	}

}
