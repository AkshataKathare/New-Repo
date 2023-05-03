package com.xworkz.circuit.component;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Television {

	@Value("Sony")
	private String brand;
	@Value("59000")
	private double cost;
	@Value("3.5")
	private double rating;
	@Value("2-8-2022")
	private String manufacturedDate;
	@Value("56")
	private double length;
	@Value("30")
	private double width;
	@Value("true")
	private boolean led;
	@Value("true")
	private boolean android;
	@Value("Online")
	private String modeOfDelivery;
	@Value("India")
	private String manufacturedIn;
	@Value("Srikanth")
	private String deliveredBy;

	public double deliveryCharge() {
		System.out.println("Running deliveryCharge in Telivision");
		return 200.67;
	}
}
