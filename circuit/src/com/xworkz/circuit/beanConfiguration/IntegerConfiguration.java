package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class IntegerConfiguration {

	@Bean
	public Integer age() {
		System.out.println("Running age method IntegerConfiguration");
		return 21;
	}

	@Bean
	public Integer noOfFloors() {
		System.out.println("Running noOfFloors in IntegerConfiguration");
		return 10;
	}

	@Bean
	public Integer eyes() {
		System.out.println("Running eyes method IntegerConfiguration");
		return 2;
	}

	@Bean
	public Integer teethCount() {
		System.out.println("Running teethCount in IntegerConfiguration");
		return 32;
	}

	@Bean
	public Integer siblings() {
		System.out.println("Running siblings method IntegerConfiguration");
		return 3;
	}

	@Bean
	public Integer pantSize() {
		System.out.println("Running pantSize in IntegerConfiguration");
		return 30;
	}

	@Bean
	public Integer shirtSize() {
		System.out.println("Running shirtSize method IntegerConfiguration");
		return 37;
	}

	@Bean
	public Integer motherAge() {
		System.out.println("Running motherAge in IntegerConfiguration");
		return 40;
	}

	@Bean
	public Integer fatherAge() {
		System.out.println("Running fatherAge method IntegerConfiguration");
		return 46;
	}

}
