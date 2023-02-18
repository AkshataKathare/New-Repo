package com.xworkz.inheritance.object.things;

public class T20Cricket extends ODICricket{

	private String sponsorName;

	public T20Cricket() {
		System.out.println("No-arg constructor in T20Cricket..");
	}

	public String getSponsorName() {
		System.out.println("Running getSponsorName in T20Cricket..");
		return "Hasmukh";
	}

}
