package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BooleanConfiguration {

	@Bean
	public Boolean female() {
		System.out.println("Running female in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean male() {
		System.out.println("Running male in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean married() {
		System.out.println("Running married in BooleanConfiguration");
		return false;
	}

	@Bean
	public Boolean unmarried() {
		System.out.println("Running unmarried in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean studying() {
		System.out.println("Running studying in BooleanConfiguration");
		return true;
	}

	@Bean
	public Boolean working() {
		System.out.println("Running working in BooleanConfiguration");
		return false;
	}

	@Bean
	public Boolean singer() {
		System.out.println("Running singer in BooleanConfiguration");
		return false;
	}
}
