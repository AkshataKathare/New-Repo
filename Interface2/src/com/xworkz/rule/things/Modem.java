package com.xworkz.rule.things;

public interface Modem {

	default double speed(String plan) {
		System.out.println("Running speed in Internet");
		return -2;
	}

}
