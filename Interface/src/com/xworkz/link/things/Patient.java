package com.xworkz.link.things;

public class Patient implements HospitalRule {

	@Override
	public boolean dressCode() {
		System.out.println("Running dressCode in Patient");
		return false;
	}

	@Override
	public boolean wearMask() {
		System.out.println("Running wearMask in Patient");
		return false;
	}

	@Override
	public int minPatients() {
		System.out.println("Running minPatients in Patient");
		return 40;
	}

	@Override
	public double openingTime() {
		System.out.println("Running openingTime in Patient");
		return 10.15;
	}

	@Override
	public double closingTime() {
		System.out.println("Running closingTime in Patient");
		return 8.30;
	}

	@Override
	public String closedDay() {
		System.out.println("Running closedDay in Patient");
		return "Thursday";
	}

	@Override
	public int checkUp() {
		System.out.println("Running wearMask in Patient");
		return 3;
	}

	@Override
	public boolean clean() {
		System.out.println("Running clean in Patient");
		return true;
	}

	@Override
	public boolean threeFloors() {
		System.out.println("Running threeFloors in Patient");
		return true;
	}

	@Override
	public boolean noSmoking() {
		System.out.println("Running noSmoking in Patient");
		return true;
	}

}
