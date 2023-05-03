package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Pizza {

	@Value("Margherita")
	private String name;
	@Value("Dominos")
	private String pizzaCentre;
	@Value("100")
	private double cost;
	@Value("39.7")
	private float diameter;
	@Value("Round")
	private String shape;
	@Value("Maida")
	private String baseMadeWith;
	@Value("true")
	private boolean mushroom;
	@Value("6")
	private int noOfpieces;
	@Value("Regular")
	private String size;
	@Value("56.8")
	private double cheeseQuantity;
	@Value("true")
	private boolean good;

	public String mode() {
		System.out.println("Running mode method in Pizza");
		return "Online";
	}
}
