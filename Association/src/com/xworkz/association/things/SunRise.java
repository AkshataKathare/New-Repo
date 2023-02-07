package com.xworkz.association.things;

public class SunRise {
	public boolean blissFul;
	public float time;
	public Light light;

	public SunRise() {
		System.out.println("No-arg constructor of Sunrise");
	}

	public SunRise(boolean blissFul, float time) {
		this.blissFul = blissFul;
		this.time = time;
		System.out.println("boolean and float constructor of Sun rise..");

	}

	public void init(Light light) {
		this.light = light;
	}

	public void display() {
		System.out.println("Details of Sun rise ..");
		System.out.println(this.blissFul);
		System.out.println(this.time);
		if (light != null) {
			this.light.show();
		} else {
			System.err.println("light is not pointing to any memory ..");
		}

	}

}
