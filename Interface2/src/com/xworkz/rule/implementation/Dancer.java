package com.xworkz.rule.implementation;

import com.xworkz.rule.things.DanceCompRule;

public class Dancer implements DanceCompRule {

	public double distance;

	@Override
	public String location(double distance) {
		System.out.println("Running location with double in Dancer");
		this.distance = distance;
		if (this.distance != 0 && this.distance <= 10) {
			System.out.println("It is near");
			return "MJ5";
		}
		System.out.println("It is not near");
		return "Prince";
	}

	@Override
	public boolean hipHop() {
		System.out.println("Running hipHop in Dancer");
		if (this.distance != 0 && this.distance == 1) {
			System.out.println("Dance is good");
			return true;

		} else {
			System.out.println("Dance is not good");
			return false;

		}
	}

}
