package com.xworkz.inheritance.things;

public class Device {

	private String brand;

	public Device() {
		System.out.println("No-arg constructor in Device");
	}

	public Device(String brand) {
		this.brand = brand;
		System.out.println("String in Device");

	}

	public String getBrand() {
		return brand;
	}

}
