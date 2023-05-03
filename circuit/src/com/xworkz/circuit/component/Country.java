package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Country {

	@Value("India")
	private String name;
	@Value("Delhi")
	private String capital;
	@Value("1298889")
	private int code;
	private int noOfStates;
	private double area;
	private int noOfSeas;
	private String smallestState;
	private String largestState;

	public Country(@Value("29") int noOfStates, @Value("7897.90") double area, @Value("45") int noOfSeas,
			@Value("Goa") String smallestState) {
		super();
		System.out.println("Creating Country with parameters..");
		this.noOfStates = noOfStates;
		this.area = area;
		this.noOfSeas = noOfSeas;
		this.smallestState = smallestState;
	}

	@Value("Madhya Pradesh")
	public void setLargestState(String largestState) {
		this.largestState = largestState;
		System.out.println("Running setLargestState in Country");
	}

	public String southNeighbour() {
		System.out.println("Running southNeighbour in Country");
		return "Sri Lanka";
	}
}
