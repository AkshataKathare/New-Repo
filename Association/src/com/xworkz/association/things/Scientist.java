package com.xworkz.association.things;

public class Scientist {
	public String name;
	public String designation;

	public Scientist() {
		System.out.println("No-arg constructor of Scientist");
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void display() {
		System.out.println("Details of Scientist..");
		System.out.println(this.name);
		System.out.println(this.designation);

	}

}
