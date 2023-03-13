package com.xworkz.rule.usage;

import com.xworkz.rule.things.DanceCompRule;

public class DanceHall {

	public DanceCompRule danceCompRule;

	public DanceHall() {
		System.out.println("No-arg const in DanceHall");
	}

	public DanceHall(DanceCompRule danceCompRule) {
		System.out.println("DanceHall const with DanceCompRule");
		this.danceCompRule = danceCompRule;
	}

	public void checkDanceCompRule() {
		String location = this.danceCompRule.location(2);
		boolean hip = this.danceCompRule.hipHop();

		if (location.equals(DanceCompRule.LOCATION) && hip) {
			System.out.println("Dance is hip hop and nearBy");
		} else {
			System.out.println("Dance is not hip hop and not nearBy");
		}
	}

}
