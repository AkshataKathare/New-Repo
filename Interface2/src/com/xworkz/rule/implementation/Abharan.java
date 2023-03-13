package com.xworkz.rule.implementation;

import com.xworkz.rule.things.GoldSeller;

public class Abharan implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram in Abharan");
		return 4770;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running getGstNo in Abharan");
		return "12J263@123";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation in Abharan");
		return "Bhashyam Circle";
	}

}
