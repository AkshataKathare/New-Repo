package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ByteConfiguration {

	@Bean
	public Byte age() {
		System.out.println("Running age in Byte");
		return 2;
	}

	@Bean
	public Byte classFloors() {
		System.out.println("Running classFloors in Byte");
		return 3;
	}

	@Bean
	public Byte buildingFloors() {
		System.out.println("Running buildingFloors in Byte");
		return 6;
	}

	@Bean
	public Byte value1() {
		System.out.println("Running value1 in Byte");
		return 7;
	}

	@Bean
	public Byte value2() {
		System.out.println("Running value2 in Byte");
		return 9;
	}

	@Bean
	public Byte value3() {
		System.out.println("Running value3 in Byte");
		return 10;
	}

	@Bean
	public Byte value4() {
		System.out.println("Running value4 in Byte");
		return 5;
	}

	@Bean
	public Byte value5() {
		System.out.println("Running value5 in Byte");
		return 4;
	}

	@Bean
	public Byte value6() {
		System.out.println("Running value6 in Byte");
		return 1;
	}
}
