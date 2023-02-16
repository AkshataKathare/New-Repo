package com.xworkz.override.things;

public class Clay extends Soil {

	public Clay() {
		System.out.println("No-arg constructor of Clay");
	}

	@Override
	public float quantityInKg() {
		System.out.println("Running float in Clay");
		return 20;
	}

}
