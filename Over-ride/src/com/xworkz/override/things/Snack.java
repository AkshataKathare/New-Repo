package com.xworkz.override.things;

public class Snack extends PaniPuri {

	public Snack() {
		System.out.println("No-arg constructor in Snack");
	}

	@Override
	public void tasty() {
		System.out.println("Running tasty in Snack");
	}

}
