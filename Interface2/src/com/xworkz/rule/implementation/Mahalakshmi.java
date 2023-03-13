package com.xworkz.rule.implementation;

import com.xworkz.rule.things.GoldSeller;

public class Mahalakshmi implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram in Mahalakshmi");
		return 5600;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running getGstNo in Mahalakshmi");
		return "12d34@sdf";
	}

	@Override
	public String getLocation() {
		System.out.println("Running getLocation in Mahalakshmi");
		return "CBT";
	}

}
