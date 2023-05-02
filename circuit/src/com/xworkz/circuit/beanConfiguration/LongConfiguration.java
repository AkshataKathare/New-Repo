package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LongConfiguration {

	@Bean
	public Long contactNo() {
		System.out.println("Running contactNo in LongConfiguration");
		return 7204223793l;
	}

	@Bean
	public Long fatherContactNo() {
		System.out.println("Running fatherContactNo in LongConfiguration");
		return 9620809927l;
	}

	@Bean
	public Long pincodeOfDharwad() {
		System.out.println("Running pincodeOfDharwad in LongConfiguration");
		return 580001l;
	}

	@Bean
	public Long pincodeOfHubli() {
		System.out.println("Running pincodeOfHubli in LongConfiguration");
		return 5800377l;
	}

	@Bean
	public Long pincodeOfTumkur() {
		System.out.println("Running pincodeOfTumkur in LongConfiguration");
		return 560023l;
	}

}
