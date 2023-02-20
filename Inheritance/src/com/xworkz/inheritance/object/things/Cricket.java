package com.xworkz.inheritance.object.things;

public class Cricket extends Sport {

	private String country;
	private String coachName;

	public Cricket() {
		System.out.println("No-arg constructor in Cricket..");
	}
	

	public String getCountry() {
		System.out.println("Running getCountry in Cricket..");
		return "India";
	}

	public String getCoachName() {
		System.out.println("Running getCoachName in Cricket..");
		return "Sagar";
	}

}
