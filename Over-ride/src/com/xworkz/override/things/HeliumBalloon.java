package com.xworkz.override.things;

public class HeliumBalloon extends Balloon {

	public HeliumBalloon() {
		System.out.println("No-arg constructor in HeliumBalloon");
	}

	@Override
	public double airContent() {
		System.out.println("Running double in HeliumBalloon");
		return 5;
	}

}
