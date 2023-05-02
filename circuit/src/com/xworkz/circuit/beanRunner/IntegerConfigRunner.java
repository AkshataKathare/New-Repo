package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.IntegerConfiguration;

public class IntegerConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(IntegerConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("=================");

		Integer value = applicationContext.getBean("age", Integer.class);
		System.out.println("Age :" + value);

		Integer value2 = applicationContext.getBean("noOfFloors", Integer.class);
		System.out.println("noOfFloors :" + value2);

		Integer value3 = applicationContext.getBean("eyes", Integer.class);
		System.out.println("eyes :" + value3);

		Integer value4 = applicationContext.getBean("teethCount", Integer.class);
		System.out.println("teethCount :" + value4);

		Integer value5 = applicationContext.getBean("siblings", Integer.class);
		System.out.println("Age :" + value5);

		Integer value6 = applicationContext.getBean("pantSize", Integer.class);
		System.out.println("noOfFloors :" + value6);

		Integer value7 = applicationContext.getBean("shirtSize", Integer.class);
		System.out.println("eyes :" + value7);

		Integer value8 = applicationContext.getBean("motherAge", Integer.class);
		System.out.println("teethCount :" + value8);

		Integer value9 = applicationContext.getBean("fatherAge", Integer.class);
		System.out.println("teethCount :" + value9);
	}

}
