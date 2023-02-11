package com.xworkz.encap.things;

public class Soap {
	private String brand;
	private String shape;

	void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	void setShape(String shape) {
		this.shape = shape;
	}

	public String getShape() {
		return this.shape;
	}

	public void display() {
		System.out.println("Details of Soap..");
		System.out.println(this.brand);
		System.out.println(this.shape);
	}

}
