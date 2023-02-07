package com.xworkz.association.things;

public class Box {
	public int size;
	public boolean big;

	public Box() {
		System.out.println("No-arg constructor in Box");
	}

	public Box(int size, boolean big) {
		this.size = size;
		this.big = big;
	}

	public void show() {
		System.out.println("Details of Box");
		System.out.println(this.size);
		System.out.println(this.big);
	}

}
