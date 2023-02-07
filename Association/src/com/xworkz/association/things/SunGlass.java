package com.xworkz.association.things;

public class SunGlass {

	public String color;
	public double price;
	public Frame frame;

	public SunGlass() {
		System.out.println("No-arg constructor in SunGlass");

	}

	public SunGlass(String color, double price) {
		this.color = color;
		this.price = price;
	}

	public void init(Frame frame) {
		this.frame = frame;
	}

	public void show() {
		System.out.println("Details of SunGlass");
		System.out.println(this.color);
		System.out.println(this.price);
		if (frame != null) {
			this.frame.show();
		} else {
			System.err.println("frame is not pointing to any memory");
		}

	}
}
