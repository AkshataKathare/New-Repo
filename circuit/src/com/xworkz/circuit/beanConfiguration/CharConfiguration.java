package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CharConfiguration {

	@Bean
	public Character div1() {
		System.out.println("Running div1 in CharConfiguration");
		return 'A';
	}

	@Bean
	public Character div2() {
		System.out.println("Running div2 in CharConfiguration");
		return 'B';
	}

	@Bean
	public Character div3() {
		System.out.println("Running div3 in CharConfiguration");
		return 'C';
	}

	@Bean
	public Character div4() {
		System.out.println("Running div4 in CharConfiguration");
		return 'D';
	}

	@Bean
	public Character div5() {
		System.out.println("Running div5 in CharConfiguration");
		return 'E';
	}

	@Bean
	public Character div6() {
		System.out.println("Running div6 in CharConfiguration");
		return 'F';
	}

}
