package com.xworkz.association.things;

public class God {
	public String name;
	public boolean garland;
	public String sareeColor;

	public void initVar(String name, boolean garland, String sareeColor) {
		this.name = name;
		this.garland = garland;
		this.sareeColor = sareeColor;
	}

	public void display() {
		System.out.println("Name of god :" + name);
		System.out.println("Garland :" + garland);
		System.out.println("Saree color of god :" + sareeColor);

	}

}
