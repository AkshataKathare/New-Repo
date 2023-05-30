package com.xworkz.summer.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.summer")
public class SummerConfiguration {

	public SummerConfiguration() {
		System.out.println("Creating " + this.getClass().getSimpleName());
	}
}
