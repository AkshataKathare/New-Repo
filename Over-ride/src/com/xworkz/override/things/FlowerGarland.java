package com.xworkz.override.things;

public class FlowerGarland extends Garland{
	public FlowerGarland() {
		System.out.println("No-arg constructor in FlowerGarland");
	}

	@Override
	public float length() {
		System.out.println("Running float in FlowerGarland");
		return 10;
	}

}
