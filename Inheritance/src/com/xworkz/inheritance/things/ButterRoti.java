package com.xworkz.inheritance.things;

public class ButterRoti extends Roti {

	private float length;

	public ButterRoti() {
		System.out.println("No-arg constructor in ButterRoti");
	}

	public ButterRoti(float length) {
		this.length = length;
		System.out.println("float in ButterRoti");
	}

	public float getLength() {
		return this.length;
	}

}
