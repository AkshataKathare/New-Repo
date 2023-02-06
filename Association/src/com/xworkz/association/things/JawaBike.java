package com.xworkz.association.things;

public class JawaBike {
	public String fuelType;
	public double cost;
	public String showRoom;
	public Engine engine = new Engine();

	public void initVar(String fuelType, double cost, String showRoom) {
		this.fuelType = fuelType;
		this.cost = cost;
		this.showRoom = showRoom;
	}

	public void display() {
		System.out.println("Fuel type used :" + fuelType);
		System.out.println("Cost of bike :" + cost);
		System.out.println("Show room :" + showRoom);
		this.engine.display();

	}

}
