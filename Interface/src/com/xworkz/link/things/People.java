package com.xworkz.link.things;

public class People implements PubRule {

	@Override
	public double entryPrice() {
		System.out.println("Running entryPrice in People");
		return 10000;
	}

	@Override
	public boolean alwaysOpen() {
		System.out.println("Running entryPrice in People");
		return false;
	}

	@Override
	public boolean drinks() {
		System.out.println("Running entryPrice in People");
		return true;
	}

	@Override
	public String activity1() {
		System.out.println("Running entryPrice in People");
		return "Dance";
	}

	@Override
	public String activity2() {
		System.out.println("Running entryPrice in People");
		return "Singing";
	}

}
