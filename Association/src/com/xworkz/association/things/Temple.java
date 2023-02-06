package com.xworkz.association.things;

public class Temple {
	public String name;
	public String location;
	public float busCharge;
	public God god = new God();

	public void initVar(String name, String location, float busCharge) {
		this.name = name;
		this.location = location;
		this.busCharge = busCharge;

	}

	public void display() {
		System.out.println("Temple name :" + name);
		System.out.println("Location of the temple :" + location);
		System.out.println("Bus Charge :" + busCharge);
		this.god.display();

	}

}
