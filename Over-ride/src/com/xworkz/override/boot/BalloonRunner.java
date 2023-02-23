package com.xworkz.override.boot;

import com.xworkz.override.things.Balloon;
import com.xworkz.override.things.HeliumBalloon;

public class BalloonRunner {

	public static void main(String[] args) {

		Balloon balloon = new HeliumBalloon();
		double air = balloon.airContent();
		System.out.println(air);
		balloon.fly();

	}

}