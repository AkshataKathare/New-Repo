package com.xworkz.association.things;

public class Frame {

	public String shape;
	public boolean goodLooking;

	public Frame() {
		System.out.println("No-arg constructor in Frame");
	}

	public Frame(String shape, boolean goodLooking) {
		this.shape = shape;
		this.goodLooking = goodLooking;
		System.out.println("String,boolean constructor of Frame");
	}

	public void show() {
		System.out.println("Details of Frame");
		System.out.println(this.shape);
		System.out.println(this.goodLooking);

	}

}
