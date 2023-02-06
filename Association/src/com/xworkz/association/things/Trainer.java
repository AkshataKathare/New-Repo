package com.xworkz.association.things;

public class Trainer {

	public String name;
	public String location;
	public int age;

	public void var(String name, String location, int age) {
		this.name = name;
		this.location = location;
		this.age = age;
	}

	public void display() {
		System.out.println("Name of trainer :" + name);
		System.out.println("Location :" + location);
		System.out.println("Age of trainer :" + name);

	}

}
