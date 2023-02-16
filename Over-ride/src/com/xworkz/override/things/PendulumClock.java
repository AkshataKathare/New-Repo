package com.xworkz.override.things;

public class PendulumClock extends Clock {

	public PendulumClock() {
		System.out.println("No-arg constructor in PendulumClock");
	}

	@Override
	public double price() {
		System.out.println("Running double in PendulumClock");
		return 10000;
	}

}
