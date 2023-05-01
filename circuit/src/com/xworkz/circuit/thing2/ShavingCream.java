package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ShavingCream {

	@Value("Gillette")
	private String brand;
	private double price;
	private char quality;

	public ShavingCream(@Value("890") double price) {
		System.out.println("Running ShavingCream with price");
		this.price = price;
	}

	@Value("A")
	public void setQuality(char quality) {
		System.out.println("Running setQuality in ShavingCream");
		this.quality = quality;
	}

	@Override
	public String toString() {
		return "ShavingCream [brand=" + brand + ", price=" + price + ", quality=" + quality + "]";
	}

}
