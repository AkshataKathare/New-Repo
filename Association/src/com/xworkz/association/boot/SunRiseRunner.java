package com.xworkz.association.boot;

import com.xworkz.association.things.Light;
import com.xworkz.association.things.SunRise;

public class SunRiseRunner {

	public static void main(String[] args) {
		SunRise sunRise = new SunRise(true, 7.00F);
		sunRise.display();

		System.out.println("=============");

		Light light = new Light("UV", 250);
		sunRise.init(light);
		sunRise.display();

	}

}
