package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class WaterBottle {

	@Value("Cyma")
	private String company;
	@Value("150")
	private double price;
	@Value("Tikare")
	private String shopName;
	@Value("Amar")
	private String ownerName;
	@Value("Steel")
	private String material;
	@Value("1")
	private double capacity;
	@Value("10")
	private float length;
	@Value("Cylindrical")
	private String shape;
	@Value("Blue")
	private String color;
	@Value("5.6")
	private double diameter;

	public String paidBy() {
		System.out.println("Running paidBy in WaterBottle");
		return "Mummy";
	}
}
