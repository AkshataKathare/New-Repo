package com.xworkz.hunger.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.hunger")
public class HungerConfiguration {

	public HungerConfiguration() {
		System.out.println("Creating " + this.getClass().getSimpleName());
	}
}
