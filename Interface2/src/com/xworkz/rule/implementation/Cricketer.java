package com.xworkz.rule.implementation;

import com.xworkz.rule.things.CricketRule;

public class Cricketer implements CricketRule {
	public Cricketer() {
		System.out.println("No-arg const in Cricketer");
	}

	@Override
	public int noOfPlayers() {
		System.out.println("Running noOfPlayers in Cricketer");
		return 11;
	}

	@Override
	public boolean goodCoach() {
		System.out.println("Running goodCoach in Cricketer");
		return false;
	}

}
