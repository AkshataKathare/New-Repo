package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Chair {

	@Value("Grey")
	private String color;
	@Value("Sqaure")
	private String shape;
	private String type;

	public Chair() {
		System.out.println("No-arg const in Chair");
	}

	@Value("Plastic")
	public void setType(String type) {
		System.out.println("Running setType method in Chair");
		this.type = type;
	}

	@Override
	public String toString() {
		return "Chair [color=" + color + ", shape=" + shape + ", type=" + type + "]";
	}

}
