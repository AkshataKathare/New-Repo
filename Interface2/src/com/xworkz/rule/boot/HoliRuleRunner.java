package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Trainee;
import com.xworkz.rule.things.HoliRule;
import com.xworkz.rule.usage.Ground;

public class HoliRuleRunner {

	public static void main(String[] args) {

		HoliRule holiRule = new Trainee();

		Ground ground = new Ground(holiRule);

	}

}
