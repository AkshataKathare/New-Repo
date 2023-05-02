package com.xworkz.circuit.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.configuration.SpringConfiguration;

public class AllRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionNames());
	}

}
