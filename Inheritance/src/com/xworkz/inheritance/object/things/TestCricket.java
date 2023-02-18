package com.xworkz.inheritance.object.things;


public class TestCricket extends Cricket {

	private String captainName;

	public TestCricket() {
		System.out.println("No-arg constructor in TestCricket..");
	}

	public String getCaptainName() {
		System.out.println("Running getCaptainName in TestCricket..");
		return "Virat Kohli";
	}

}
