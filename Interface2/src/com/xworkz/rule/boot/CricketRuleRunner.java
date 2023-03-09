package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Cricketer;
import com.xworkz.rule.things.CricketRule;
import com.xworkz.rule.things.CricketGround;

public class CricketRuleRunner {

	public static void main(String[] args) {

		CricketRule cricketRule = new Cricketer();

		CricketGround cricket = new CricketGround(cricketRule);
		cricket.checkCricketRule();

	}

}
