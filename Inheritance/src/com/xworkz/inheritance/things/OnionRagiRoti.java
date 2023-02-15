package com.xworkz.inheritance.things;

public class OnionRagiRoti extends RagiRoti {

	private float weight;

	public OnionRagiRoti() {
		System.out.println("No-arg constructor in OnionRagiRoti");
	}

	public OnionRagiRoti(float weight) {
		this.weight = weight;
		System.out.println("Float in OnionRagiRoti");
	}

	public float getWeight() {
		return this.weight;
	}

}
