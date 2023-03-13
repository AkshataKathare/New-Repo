package com.xworkz.rule.implementation;

import com.xworkz.rule.things.GoldSeller;

public class DevendraSetu implements GoldSeller {

	@Override
	public double pricePerGram() {
		System.out.println("Runnung pricePerGram in DevendraSetu");
		return 7000;
	}

	@Override
	public String getGstNo() {
		System.out.println("Runnung getGstNo in DevendraSetu");
		return "28K1278";
	}

	@Override
	public String getLocation() {
		System.out.println("Runnung getLocation in DevendraSetu");
		return "Raviwar Peth";
	}

}
