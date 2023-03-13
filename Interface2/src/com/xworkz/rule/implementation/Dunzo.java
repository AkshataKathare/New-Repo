package com.xworkz.rule.implementation;

import com.xworkz.rule.things.Delivery;

public class Dunzo implements Delivery {

	@Override
	public double charges() {
		System.out.println("Running charges in Dunzo");
		return 70;

	}

	@Override
	public double timeTaken() {
		System.out.println("Running timeTaken in Dunzo");
		return 50;
	}

	@Override
	public String agentName(int rating) {
		System.out.println("Running agentName in Dunzo");
		if (rating == 1) {
			System.out.println("Rating in 1");
			return "Basavaraj";
		}
		if (rating == 2) {
			System.out.println("Rating is 2");
			return "Dinakar";
		}
		if (rating == 3) {
			System.out.println("rating is 3");
			return "Shivakumar";
		}
		return "Others";

	}

}
