package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HairDryer {

	@Value("Philips")
	private String brand;
	@Value("Electrical")
	private String type;
	private String color;
	private double weight;
	private int rpm;

	public HairDryer(@Value("Black") String color, @Value("65") double weight) {
		System.out.println("Running HairDryer with color and weight");
		this.color = color;
		this.weight = weight;
	}

	@Value("24")
	public void setRpm(int rpm) {
		System.out.println("Running setRpm in HairDryer");
		this.rpm = rpm;
	}

	@Override
	public String toString() {
		return "HairDryer [brand=" + brand + ", type=" + type + ", color=" + color + ", weight=" + weight + ", rpm="
				+ rpm + "]";
	}
}
