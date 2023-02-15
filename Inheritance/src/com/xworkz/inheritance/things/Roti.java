package com.xworkz.inheritance.things;

public class Roti {

	private String shape;

	public Roti() {
		System.out.println("No-arg constructor in Roti");
	}

	public Roti(String shape) {
		this.shape = shape;
		System.out.println("String in Roti");
	}

	public String getShape() {
		return this.shape;
	}

}
