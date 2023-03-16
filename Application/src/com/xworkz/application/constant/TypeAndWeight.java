package com.xworkz.application.constant;

public enum TypeAndWeight {

	OVER_EAR(70), EARPODS(35), ON_EAR(50), IN_EAR(80);

	private final double weight;

	private TypeAndWeight(double weight) {
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

}
