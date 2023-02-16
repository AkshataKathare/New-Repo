package com.xworkz.override.things;

public class Garland {

	public Garland() {
		System.out.println("No-arg constructor in Garland");
	}

	public float length() {
		System.out.println("Running float in Garland");
		return 5;
	}

	public String type() {
		System.out.println("Running String in Garland");
		return "Rose Garland";
	}

}
