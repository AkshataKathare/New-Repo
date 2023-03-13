package com.xworkz.rule.implementation;

import com.xworkz.rule.things.GoldSeller;

public class Malabar implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Running pricePerGram in Malabar");
		return 5000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Running pricePerGram in Malabar");
		return "12a@jak";
	}

	@Override
	public String getLocation() {
		System.out.println("Running pricePerGram in Malabar");
		return "Gandhi Chowk";
	}

}
