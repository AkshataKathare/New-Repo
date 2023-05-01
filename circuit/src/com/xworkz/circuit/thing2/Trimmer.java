package com.xworkz.circuit.thing2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Trimmer {

	@Value("Golden")
	private String brand;
	private String color;
	private double price;
	private float height;

	public Trimmer(@Value("Blue") String color, @Value("780") double price) {
		System.out.println("Running Trimmer with color,price");
		this.color = color;
		this.price = price;
	}

	@Value("5.5")
	public void setHeight(float height) {
		System.out.println("Running setHeight in Trimmer");
		this.height = height;
	}

	@Override
	public String toString() {
		return "Trimmer [brand=" + brand + ", color=" + color + ", price=" + price + ", height=" + height + "]";
	}

}
