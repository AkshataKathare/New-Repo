package com.xworkz.association.things;

public class Light {
	public String type;
	public float intensity;

	public Light() {
		System.out.println("No-arg constructor of Light");

	}

	public Light(String type, float intensity) {
		this.type = type;
		this.intensity = intensity;

	}

	public void show() {
		System.out.println("Details of Light");
		System.out.println(this.type);
		System.out.println(this.intensity);
	}

}
