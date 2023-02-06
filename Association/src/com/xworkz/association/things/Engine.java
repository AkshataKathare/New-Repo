package com.xworkz.association.things;

public class Engine {
	public String density;
	public String type;
	public double cost;

	public void initVar(String density, String type, double cost) {
		this.density = density;
		this.type = type;
		this.cost = cost;
	}

	public void display() {
		System.out.println("Density of engine :" + density);
		System.out.println("Type :" + type);
		System.out.println("Cost of engine :" + cost);
	}

}
