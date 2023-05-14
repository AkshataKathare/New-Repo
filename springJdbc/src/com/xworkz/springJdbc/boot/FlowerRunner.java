package com.xworkz.springJdbc.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springJdbc.configuration.FlowerConfiguration;

public class FlowerRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(FlowerConfiguration.class);

		System.out.println(spring.getBeanDefinitionNames());
		
	}

}
