package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Temple {

	@Value("Ram Mandir")
	private String name;
	@Value("Ram")
	private String godName;
	@Value("Rajajinagar")
	private String location;
	@Value("Bengaluru")
	private String city;
	@Value("true")
	private boolean nearBy;
	@Value("5")
	private int busCharge;
	@Value("Saturday")
	private String dayOfGod;
	@Value("Ganesh")
	private String ownerName;
	@Value("489")
	private double area;

	public String pujari() {
		System.out.println("Running pujari in Temple");
		return "Sagar";
	}
}
