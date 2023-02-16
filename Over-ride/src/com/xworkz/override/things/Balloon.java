package com.xworkz.override.things;

public class Balloon {
	
	public Balloon() {
		System.out.println("No-arg constructor in Balloon");
	}
	public double airContent() {
		System.out.println("Running double in Balloon");
		return 3.5; 
	}
	
	public void fly() {
		System.out.println("Running fly in Balloon");
	}

}
