package com.xworkz.inheritance.things;

public class Sport {
	public String location;

	public Sport() {
		System.out.println("No-arg constructor in Sport");
	}

	public Sport(String location) {
		this.location = location;
		System.out.println("String constructor in Sport");
	}

	public String getLocation() {
		return location;
	}

}
