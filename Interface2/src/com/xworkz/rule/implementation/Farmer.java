package com.xworkz.rule.implementation;

import com.xworkz.rule.things.FarmRule;

public class Farmer implements FarmRule {
	private String soil;

	public Farmer() {
		System.out.println("No-arg constructor in Farmer");
	}

	@Override
	public double areaInSq(String soil) {
		System.out.println("Running areaInSq in Farmer");
		this.soil = soil;
		if (this.soil != null && this.soil.equals("Clay")) {
			System.out.println("It is clay soil");
			return 20.5;
		}
		System.out.println("It is not clay soil");
		return 15.6;
	}

	@Override
	public boolean large() {
		if (soil.equals("Red soil")) {
			return true;
		} else {
			return false;
		}
	}

}
