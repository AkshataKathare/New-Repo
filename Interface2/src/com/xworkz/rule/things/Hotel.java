package com.xworkz.rule.things;

public class Hotel {
	public EatingRule eatingRule;

	public Hotel(EatingRule eatingRule) {
		System.out.println("EatingRule const in Hotel");
		this.eatingRule = eatingRule;
	}

	public void checkEatingRule() {
		boolean washed = this.eatingRule.washedHands("Mansik");
		double duration = this.eatingRule.durationTaken();

		if (duration <= EatingRule.DURATION && washed) {
			System.out.println("Eating is good");
		}
		System.out.println("Eating is not good");
	}

}
