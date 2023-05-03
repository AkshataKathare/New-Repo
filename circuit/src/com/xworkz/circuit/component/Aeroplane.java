package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Aeroplane {

	@Value("Air Bus")
	private String companyName;
	@Value("White")
	private String color;
	@Value("78.9")
	private double length;
	private float ticketPrice;
	private String owner;
	private int noOfStaff;
	private int classes;
	private String pilotName;
	private String guideName;

	public Aeroplane(@Value("5000.67") float ticketPrice, @Value("Pooja") String owner, @Value("568") int noOfStaff,
			@Value("6") int classes, @Value("Wilson") String pilotName) {
		super();
		System.out.println("Creating Aeroplane using parameters..");
		this.ticketPrice = ticketPrice;
		this.owner = owner;
		this.noOfStaff = noOfStaff;
		this.classes = classes;
		this.pilotName = pilotName;
	}

	@Value("Akshara")
	public void setGuideName(String guideName) {
		System.out.println("Running setGuideName in Aeroplane");
		this.guideName = guideName;
	}

	public int helpLineNumber() {
		System.out.println("Running helpLineNumber in Aeroplane");
		return 1067;
	}

}
