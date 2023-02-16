package com.xworkz.override.boot;

import com.xworkz.override.things.FlowerGarland;
import com.xworkz.override.things.Garland;

public class GarlandRunner {

	public static void main(String[] args) {

		Garland garland = new FlowerGarland();
		float length = garland.length();
		System.out.println(length);
		String type = garland.type();
		System.out.println(type);

	}

}
