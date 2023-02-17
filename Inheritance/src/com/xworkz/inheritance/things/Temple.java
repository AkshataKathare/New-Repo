package com.xworkz.inheritance.things;

public class Temple {

	public String location = "Raviwar Peth";

	public Temple() {
		System.out.println("No-arg constructor in Temple");
	}

	// bell can be accessed by ref and subclass can inherit this as it is public.
	public void bell() {
		System.out.println("Running bell in Temple..");
	}

	// distance can be accessed only by the classes in same package and inherit in
	// same package
	double distance() {
		System.out.println("Running distance in Temple..");
		return 20;
	}

	// ticketPrice can be inherited by the classes of same package and class of
	// different package but we cant create instance
	protected double ticketPrice() {
		System.out.println("Running ticketPrice in Temple..");
		return 30;
	}

	// package-default methods cannot be accessed by instance ref or cannot be
	// inherited by any class
	private String name() {
		System.out.println("Running name in Temple.");
		return "Laxmi";
	}

}
