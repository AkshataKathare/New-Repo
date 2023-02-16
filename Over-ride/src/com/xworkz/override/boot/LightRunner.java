package com.xworkz.override.boot;

import com.xworkz.override.things.PhilipsTubeLight;
import com.xworkz.override.things.TubeLight;

public class LightRunner {

	public static void main(String[] args) {

		TubeLight light = new PhilipsTubeLight();
		String shop = light.shop();
		System.out.println(shop);
		light.bright();

	}

}
