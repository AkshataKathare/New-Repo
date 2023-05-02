package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShortConfiguration {

	@Bean
	public Short age() {
		System.out.println("Running age in Byte");
		return 2;
	}

	@Bean
	public Short classFloors() {
		System.out.println("Running classFloors in Byte");
		return 3;
	}

	@Bean
	public Short buildingFloors() {
		System.out.println("Running buildingFloors in Byte");
		return 6;
	}

	@Bean
	public Short value1() {
		System.out.println("Running value1 in Byte");
		return 7;
	}

	@Bean
	public Short value2() {
		System.out.println("Running value2 in Byte");
		return 9;
	}

	@Bean
	public Short value3() {
		System.out.println("Running value3 in Byte");
		return 10;
	}

	@Bean
	public Short value4() {
		System.out.println("Running value4 in Byte");
		return 5;
	}

	@Bean
	public Short value5() {
		System.out.println("Running value5 in Byte");
		return 4;
	}

	@Bean
	public Short value6() {
		System.out.println("Running value6 in Byte");
		return 1;
	}

}
