package com.xworkz.mango.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.mango")
public class MangoConfiguration {

	public MangoConfiguration() {
		System.out.println("Creating " + this.getClass().getSimpleName());
	}
}
