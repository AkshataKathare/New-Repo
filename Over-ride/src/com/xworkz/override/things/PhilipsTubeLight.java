package com.xworkz.override.things;

public class PhilipsTubeLight extends TubeLight {

	public PhilipsTubeLight() {
		System.out.println("No-arg constructor in PhilipsTubeLight");
	}

	@Override
	public String shop() {
		System.out.println("Running Shop in PhilipsTubeLight");
		return "Bajaj";
	}

}
