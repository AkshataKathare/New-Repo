package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Laptop {

	@Value("Asus")
	private String brand;
	@Value("55000")
	private double cost;
	@Value("25")
	private float length;
	@Value("15")
	private float width;
	private double weight;
	private double ram;
	private float storage;
	private String color;
	private boolean good;
	private String mode;

	public Laptop(@Value("45.7") double weight, @Value("27") double ram, @Value("528") float storage,
			@Value("Black") String color, @Value("true") boolean good) {
		super();
		System.out.println("Creating Laptop using parameters");
		this.weight = weight;
		this.ram = ram;
		this.storage = storage;
		this.color = color;
		this.good = good;
	}

	@Value("Online")
	public void setMode(String mode) {
		System.out.println("Running setMode method in Laptop");
		this.mode = mode;
	}

	public boolean fullFlip() {
		System.out.println("Running fullFlip method in Laptop");
		return false;
	}

}
