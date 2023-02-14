package com.xworkz.inheritance.things;

public class ValentineDay {

	private boolean special;

	public ValentineDay() {
		System.out.println("No-arg constructor in ValentineDay");
	}

	public ValentineDay(boolean special) {
		this.special = special;
	}

	public boolean getSpecial() {
		return special;
	}

}
