package com.xworkz.rule.usage;

import com.xworkz.rule.things.FarmRule;

public class FarmLand {
	public FarmRule farmRule;

	public FarmLand() {
		System.out.println("No-arg const in FarmLand");
	}

	public FarmLand(FarmRule farmRule) {
		System.out.println("FarmLand const with FarmRule");
		this.farmRule = farmRule;
	}

	public void checkFarmRule() {
		double area = this.farmRule.areaInSq("Red Soil");
		boolean large = this.farmRule.large();

		if (area <= FarmRule.AREA && large == true) {
			System.out.println("Area is large");
		} else {
			System.out.println("Area is not large");
		}
	}

}
