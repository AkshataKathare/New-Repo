package com.xworkz.butter.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.butter.controller")
public class ButterConfiguration {

	public ButterConfiguration() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}
}
