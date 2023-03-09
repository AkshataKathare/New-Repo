package com.xworkz.rule.implementation;

import com.xworkz.rule.things.EatingRule;

public class Customer implements EatingRule {
	private String name;

	public Customer() {
		System.out.println("No-arg constructor in Customer");
	}

	@Override
	public boolean washedHands(String name) {
		this.name = name;
		System.out.println("Running washedHands in Customer");
		if (name != null && this.name.equals("Mansik")) {
			System.out.println("Mansik didn't wash hands");
			return false;
		}
		System.out.println("It is not Mansik");
		return true;
	}

	@Override
	public double durationTaken() {
		if (this.name == "Mansik") {
			return 60;
		} else {
			return 30;
		}

	}

}
