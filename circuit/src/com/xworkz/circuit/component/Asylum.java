package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Asylum {

	@Value("Pandurangi Asylum")
	private String name;
	@Value("100")
	private int noOfPatients;
	@Value("Nagesh")
	private String agedPatient;
	@Value("Dr.Pandurangi")
	private String owner;
	@Value("Dr.Pandurangi")
	private String doctor;
	@Value("20")
	private double experienceOfDoctor;
	@Value("45")
	private int noOfCells;
	@Value("389.78")
	private float area;
	@Value("Line Bazar")
	private String location;
	@Value("true")
	private boolean bestDoctor;

	public String city() {
		System.out.println("Running city in Asylum");
		return "Dharwad";
	}

}
