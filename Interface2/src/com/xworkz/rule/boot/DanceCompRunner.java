package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Dancer;
import com.xworkz.rule.things.DanceCompRule;
import com.xworkz.rule.usage.DanceHall;

public class DanceCompRunner {

	public static void main(String[] args) {
		DanceCompRule danceCompRule = new Dancer();

		DanceHall danceHall = new DanceHall(danceCompRule);
		danceHall.checkDanceCompRule();

	}

}
