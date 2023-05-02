package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Flower {

	@Value("Rose")
	private String name;
	@Value("Red")
	private String color;
	@Value("4.6")
	private double diameter;
	@Value("30.8")
	private float price;
	@Value("4.9")
	private double length;
	@Value("20")
	private int noOfPetals;
	@Value("true")
	private boolean dye;
	@Value("true")
	private boolean hasFragrance;
	private boolean plant;
	private String medicineFor;
	private char size;
	private boolean big;
	private String seedColor;

	public Flower(@Value("true") boolean plant, @Value("Anaemia") String medicineFor, @Value("6") char size,
			@Value("false") boolean big, @Value("Vimal") String grownBy) {
		super();
		System.out.println("Creating Flower using parameters");
		this.plant = plant;
		this.medicineFor = medicineFor;
		this.size = size;
		this.big = big;
	}

	@Value("Brown")
	public void setSeedColor(String seedColor) {
		System.out.println("Running setSeedColor in Flower");
		this.seedColor = seedColor;
	}

	@Bean
	public String place() {
		System.out.println("Running place method in Flower");
		return "Davangere";
	}

}
