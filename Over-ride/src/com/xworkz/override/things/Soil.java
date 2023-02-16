package com.xworkz.override.things;

public class Soil {

	public Soil() {
		System.out.println("No-arg constructor in Soil");
	}

	public float quantityInKg() {
		System.out.println("Running quantity in Soil");
		return 28;
	}

	public void dry() {
		System.out.println("Running dry in Soil");
	}

}
