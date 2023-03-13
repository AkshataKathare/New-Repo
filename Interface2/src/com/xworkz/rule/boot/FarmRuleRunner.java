package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Farmer;
import com.xworkz.rule.things.FarmRule;
import com.xworkz.rule.usage.FarmLand;

public class FarmRuleRunner {

	public static void main(String[] args) {

		FarmRule farmRule = new Farmer();

		FarmLand farmLand = new FarmLand(farmRule);
		farmLand.checkFarmRule();

	}

}
