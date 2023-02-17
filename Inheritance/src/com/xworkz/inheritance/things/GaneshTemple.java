package com.xworkz.inheritance.things;

public class GaneshTemple extends Temple {

	public GaneshTemple() {
		System.out.println("No-arg constructor in GaneshTemple");
	}

	public String location = "Bhashyam Circle";

	@Override
	public void bell() {
		System.out.println("Running bell in GaneshTemple");
	}

	@Override
	public double distance() {
		System.out.println("Running distance in GaneshTemple..");
		return 30;
	}

	@Override
	public double ticketPrice() {
		System.out.println("Running ticketPrice in GaneshTemple..");
		return 60;
	}

	public void displayDetails() {
		System.out.println("Details of Temple..");
		System.out.println(this.location);
		System.out.println(super.location);
		super.bell();//invoking method bell() from parent class
		super.distance();
		System.out.println(this.ticketPrice());
		super.ticketPrice();
	}
}
