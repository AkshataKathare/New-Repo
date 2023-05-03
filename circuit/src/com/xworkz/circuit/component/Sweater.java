package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Sweater {

	@Value("Grey")
	private String color;
	@Value("PUMA")
	private String brand;
	@Value("30")
	private int size;
	@Value("Steel")
	private String zipType;
	private String madeIn;
	private double price;
	private float length;
	private float width;
	private String material;
	private boolean fullSleeves;

	public Sweater(@Value("India") String madeIn, @Value("450") double price, @Value("15.5") float length,
			@Value("3.5") float width, @Value("Woolen") String material) {
		super();
		System.out.println("Creating Sweater using parameters");
		this.madeIn = madeIn;
		this.price = price;
		this.length = length;
		this.width = width;
		this.material = material;
	}

	@Value("true")
	public void isFullSleeves(boolean fullSleeves) {
		System.out.println("Running isFullSleeves in Sweater");
		this.fullSleeves = fullSleeves;
	}

	public String shopName() {
		System.out.println("Running shopName in Sweater");
		return "Nakoda";
	}

}
