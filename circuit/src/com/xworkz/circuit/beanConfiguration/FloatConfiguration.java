package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FloatConfiguration {

	@Bean
	public Float salary() {
		System.out.println("Running salary in FloatConfiguration");
		return 25000.50f;
	}

	@Bean
	public Float height() {
		System.out.println("Running height in FloatConfiguration");
		return 4.10f;
	}

	@Bean
	public Float weight() {
		System.out.println("Running weight in FloatConfiguration");
		return 53.5f;
	}

	@Bean
	public Float distance() {
		System.out.println("Running distance in FloatConfiguration");
		return 350.80f;
	}

	@Bean
	public Float cost() {
		System.out.println("Running cost in FloatConfiguration");
		return 500f;
	}

	@Bean
	public Float quantityOfMilk() {
		System.out.println("Running quantityOfMilk in FloatConfiguration");
		return 1.5f;
	}

	@Bean
	public Float quantityOfRice() {
		System.out.println("Running quantityOfRice in FloatConfiguration");
		return 25.5f;
	}

	@Bean
	public Float wheatPrice() {
		System.out.println("Running wheatPrice in FloatConfiguration");
		return 1200.89f;
	}

	@Bean
	public Float dosaLength() {
		System.out.println("Running dosaLength in FloatConfiguration");
		return 3.56f;
	}

}
