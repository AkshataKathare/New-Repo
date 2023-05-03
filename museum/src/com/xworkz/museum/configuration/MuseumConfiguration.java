package com.xworkz.museum.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.museum")
public class MuseumConfiguration {

	@Bean
	public String animalMask() {
		System.out.println("Running animalMask in MuseumConfiguration");
		return "Monkey";
	}
}
