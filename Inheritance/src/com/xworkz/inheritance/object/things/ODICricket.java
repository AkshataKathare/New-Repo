package com.xworkz.inheritance.object.things;

public class ODICricket extends Cricket {

	private String groundName;

	public ODICricket() {
		System.out.println("No-arg constructor in ODICricket");
	}

	public String getGroundName() {
		System.out.println("Running getGroundName in ODICricket");
		return "Chinnaswami Stadium";
	}

}
