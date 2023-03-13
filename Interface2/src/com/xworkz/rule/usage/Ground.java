package com.xworkz.rule.usage;

import com.xworkz.rule.implementation.Trainee;
import com.xworkz.rule.things.HoliRule;

public class Ground {

	public HoliRule holiRule;

	public Ground(HoliRule holiRule) {
		System.out.println("Running Ground with Trainee");
		this.holiRule = holiRule;
	}

	public void checkHoliRule() {
		boolean waterColor = this.holiRule.waterColor("Red");
		double quantity = this.holiRule.quantity();

		if (quantity <= HoliRule.QUANTITY && waterColor == true) {
			System.out.println("Holi is enjoyable");
		} else {
			System.out.println("Holi is not enjoyable");
		}
	}

}
