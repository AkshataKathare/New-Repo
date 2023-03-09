package com.xworkz.rule.implementation;

import com.xworkz.rule.things.HoliRule;

public class Trainee implements HoliRule {

	private String color;

	@Override
	public boolean waterColor(String color) {
		System.out.println("Running waterColor in Trainee");
		this.color = color;
		if (this.color != null && this.color.equals("Purple")) {
			System.out.println("Color is purple");
			return false;
		}
		System.out.println("Color is not pruple");
		return true;
	}

	@Override
	public double quantity() {
		if (this.color.equals("Purple")) {
			return 1;
		} else {
			return 2;
		}
	}

}
