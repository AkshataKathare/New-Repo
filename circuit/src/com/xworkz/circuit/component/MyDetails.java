package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class MyDetails {

	@Value("Akshata")
	private String name;
	@Value("Dattatraya")
	private String fatherName;
	@Value("Vimal")
	private String motherName;
	@Value("Dharwad")
	private String place;
	private String state;
	private String country;
	private long contactNo;
	private String emailID;
	private String brother;
	private String sister;

	public MyDetails(@Value("Karnataka") String state, @Value("India") String country,
			@Value("7204223793") long contactNo, @Value("akshata@gmail.com") String emailID,
			@Value("Abhishek") String brother) {
		super();
		System.out.println("Creating MyDetails using parameters");
		this.state = state;
		this.country = country;
		this.contactNo = contactNo;
		this.emailID = emailID;
		this.brother = brother;
	}

	@Value("Arpita")
	public void setSister(String sister) {
		System.out.println("Running setSister method in MyDetails");
		this.sister = sister;
	}

	@Bean
	public String houseName() {
		System.out.println("Running houseName in MyDetails");
		return "Anuprabha";
	}

}
