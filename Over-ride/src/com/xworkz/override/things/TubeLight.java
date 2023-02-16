package com.xworkz.override.things;

public class TubeLight {

	public TubeLight() {
		System.out.println("No-arg constructor in TubeLight");
	}

	public String shop() {
		System.out.println("Running Shop in TubeLight");
		return "Philips";
	}

	public void bright() {
		System.out.println("Running bright in TubeLight");
	}

}
