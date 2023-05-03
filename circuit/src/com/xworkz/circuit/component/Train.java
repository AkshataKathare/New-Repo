package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Train {

	@Value("Siddaganga")
	private String name;
	@Value("12068")
	private int number;
	@Value("5.15")
	private double departTime;
	@Value("2.15")
	private float reachingTime;
	@Value("Dharwad")
	private String from;
	@Value("Bengaluru")
	private String to;
	private String via;
	private String country;
	private String color;
	private int noOfBlocks;
	private int noOfSeats;
	private boolean fast;
	private String driverName;
	private double speed;
	private float ticketPrice;

	public Train(@Value("Birur") String via, @Value("India") String country, @Value("Blue") String color,
			@Value("30") int noOfBlocks, @Value("500") int noOfSeats, @Value("true") boolean fast,
			@Value("Smith") String driverName) {
		super();
		System.out.println("Creating Train using parameters...");
		this.via = via;
		this.country = country;
		this.color = color;
		this.noOfBlocks = noOfBlocks;
		this.noOfSeats = noOfSeats;
		this.fast = fast;
		this.driverName = driverName;
	}

	@Value("28")
	public void setSpeed(double speed) {
		System.out.println("Running setSpeed in Train");
		this.speed = speed;
	}

	@Value("115")
	public void setTicketPrice(float ticketPrice) {
		System.out.println("Running setTicketPrice in Train");
		this.ticketPrice = ticketPrice;
	}

	public String newColor() {
		System.out.println("Running newColor in Train");
		return "Cream";
	}
}
