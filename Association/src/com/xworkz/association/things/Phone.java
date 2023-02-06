package com.xworkz.association.things;

public class Phone {

	public String brand;
	public double cost;
	public float version;
	public Camera camera = new Camera();

	public void initVariables(String brand, double cost, float version) {

		this.brand = brand;
		this.cost = cost;
		this.version = version;
	}

	public void display() {
		System.out.println("Brand of phone :" + brand);
		System.out.println("Cost of phone :" + cost);
		System.out.println("Version of phone :" + version);
		this.camera.display();
	}

}
