package com.xworkz.rule.things;

public interface EatingRule {
	double DURATION = 15;

	boolean washedHands(String name);

	double durationTaken();

}
