package com.xworkz.override.things;

public class CarnivorousAnimal extends Tiger {

	public CarnivorousAnimal() {
		System.out.println("No-arg constructor in CarnivorousAnimal");
	}

	@Override
	public boolean wildAnimal() {
		System.out.println("Running wildAnimal in CarnivorousAnimal");
		return false;

	}

}
