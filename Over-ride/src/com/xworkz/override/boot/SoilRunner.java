package com.xworkz.override.boot;

import com.xworkz.override.things.Clay;
import com.xworkz.override.things.Soil;

public class SoilRunner {

	public static void main(String[] args) {

		Soil clay = new Clay();
		float quantity = clay.quantityInKg();
		System.out.println(quantity);
		clay.dry();

	}

}
