package com.xworkz.springJdbc.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springJdbc.configuration.FlowerConfiguration;
import com.xworkz.springJdbc.repository.FlowerRepositoryImpl;
import com.xworkz.springJdbc.things.Flower;

public class FlowerRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(FlowerConfiguration.class);

		FlowerRepositoryImpl bean = spring.getBean(FlowerRepositoryImpl.class);
		System.out.println(spring.getBeanDefinitionCount());
		Stream.of(spring.getBeanDefinitionNames()).forEach(e -> System.out.println(e));

		Flower flower = new Flower("Rose", "Red");
		int i = bean.insertFlower(flower);
		System.out.println(i);
		System.out.println(flower);

	}

}
