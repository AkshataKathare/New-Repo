package com.xworkz.circuit.beanConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.ToString;

@Configuration
@ToString
public class StringConfiguration {

	@Bean
	public String soil() {
		System.out.println("Running soil in StringConfiguration");
		return "Sandy soil";
	}

	@Bean
	public String name() {
		System.out.println("Running name method in StringConfiguration");
		return "Akshata";
	}

	@Bean
	public String city() {
		System.out.println("Running city method in StringConfiguration");
		return "Dharwad";
	}

	@Bean
	public String state() {
		System.out.println("Running state method in StringConfiguration");
		return "Karnataka";

	}

	@Bean
	public String country() {
		System.out.println("Running country in StringConfiguration");
		return "India";
	}

	@Bean
	public String continent() {
		System.out.println("Running continent method in StringConfiguration");
		return "Asia";
	}

	@Bean
	public String address() {
		System.out.println("Running city method in StringConfiguration");
		return "Gandhi Chowk";
	}

	@Bean
	public String motherName() {
		System.out.println("Running state method in StringConfiguration");
		return "Vimal";

	}

	@Bean
	public String fatherName() {
		System.out.println("Running soil in StringConfiguration");
		return "Dattatraya";
	}

	@Bean
	public String brother() {
		System.out.println("Running name method in StringConfiguration");
		return "Abhishek";
	}

	@Bean
	public String sister() {
		System.out.println("Running city method in StringConfiguration");
		return "Arpita";
	}

	@Bean
	public String grandMother() {
		System.out.println("Running state method in StringConfiguration");
		return "Jayalaxmi";

	}

	@Bean
	public String grandFather() {
		System.out.println("Running name method in StringConfiguration");
		return "Maruti Rao";
	}

	@Bean
	public String aunty() {
		System.out.println("Running city method in StringConfiguration");
		return "Annapoorna";
	}

	@Bean
	public String uncle() {
		System.out.println("Running state method in StringConfiguration");
		return "Madan";

	}
}
