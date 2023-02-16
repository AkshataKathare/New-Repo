package com.xworkz.override.things;

public class Clock {

	public Clock() {
		System.out.println("No-arg constructor in Clock");
	}

	public double price() {
		System.out.println("Running double in Clock");
		return 1000;
	}

	public void beautiful() {
		System.out.println("Running beautiful in Clock");
	}

}
