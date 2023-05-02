package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DoubleConfiguration {

	@Bean
	public Double height() {
		System.out.println("Running height in DoubleConfiguration");
		return 5.6;
	}

	@Bean
	public Double weight() {
		System.out.println("Running weight in DoubleConfiguration");
		return 39.9;
	}

	@Bean
	public Double roomSize() {
		System.out.println("Running roomSize in DoubleConfiguration");
		return 29.8;
	}

	@Bean
	public Double waistSize() {
		System.out.println("Running waistSize in DoubleConfiguration");
		return 32.6;
	}

	@Bean
	public Double iceCreamQuantity() {
		System.out.println("Running iceCreamQuantity in DoubleConfiguration");
		return 29.7;
	}

	@Bean
	public Double goldRate() {
		System.out.println("Running goldRate in DoubleConfiguration");
		return 57008.56;
	}

	@Bean
	public Double silverRate() {
		System.out.println("Running silverRate in DoubleConfiguration");
		return 20890.45;
	}

	@Bean
	public Double ringSize() {
		System.out.println("Running ringSize in DoubleConfiguration");
		return 2.3;
	}

	@Bean
	public Double bangleSize() {
		System.out.println("Running bangleSize in DoubleConfiguration");
		return 2.5;
	}

}
