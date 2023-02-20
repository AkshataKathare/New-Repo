package com.xworkz.inheritance.object.things;

public class Day {

	private String day;

	public Day() {
		System.out.println("No-arg constructor in Day..");
	}

	public String getDay() {
		return day;
	}

	@Override
	public String toString() {
		return "[Day :" + "Saturday]";
	}

}
