package com.xworkz.inheritance.object.things;

public class Sport {

	private int total;

	public Sport() {
		System.out.println("No-arg constructor in Sport..");
	}

	public int getTotal() {
		System.out.println("Running getTotal in Sport..");
		return 11;
	}
	
	public void display(Sport sport) {
		System.out.println(sport);
	}
	


}
