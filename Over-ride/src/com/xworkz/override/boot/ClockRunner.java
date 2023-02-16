package com.xworkz.override.boot;

import com.xworkz.override.things.Clock;
import com.xworkz.override.things.PendulumClock;

public class ClockRunner {

	public static void main(String[] args) {

		Clock clock = new PendulumClock();
		double price = clock.price();
		System.out.println(price);
		clock.beautiful();

	}

}
