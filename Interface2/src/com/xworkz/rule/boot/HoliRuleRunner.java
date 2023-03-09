package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Trainee;
import com.xworkz.rule.things.Ground;
import com.xworkz.rule.things.HoliRule;

public class HoliRuleRunner {

	public static void main(String[] args) {

		HoliRule holiRule = new Trainee();

		Ground ground = new Ground(holiRule);

	}

}
