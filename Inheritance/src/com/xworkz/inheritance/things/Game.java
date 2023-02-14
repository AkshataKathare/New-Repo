package com.xworkz.inheritance.things;

public class Game {

	private float dataConsumption;

	public Game() {
		System.out.println("No-arg constructor in Game");
	}

	public Game(float dataConsumption) {
		this.dataConsumption = dataConsumption;
		System.out.println("String constructor in Game");
	}

	public float getData() {
		return dataConsumption;
	}

}
