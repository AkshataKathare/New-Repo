package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.DoubleConfiguration;

public class DoubleConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DoubleConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("======================");
		
		Double value = applicationContext.getBean("height", Double.class);
		System.out.println("height :" + value);

		Double value2 = applicationContext.getBean("weight", Double.class);
		System.out.println("weight :" + value2);

		Double value3 = applicationContext.getBean("roomSize", Double.class);
		System.out.println("roomSize :" + value3);

		Double value4 = applicationContext.getBean("waistSize", Double.class);
		System.out.println("waistSize :" + value4);

		Double value5 = applicationContext.getBean("iceCreamQuantity", Double.class);
		System.out.println("iceCreamQuantity :" + value5);

		Double value6 = applicationContext.getBean("goldRate", Double.class);
		System.out.println("goldRate :" + value6);

		Double value7 = applicationContext.getBean("silverRate", Double.class);
		System.out.println("silverRate :" + value7);

		Double value8 = applicationContext.getBean("ringSize", Double.class);
		System.out.println("ringSize :" + value8);

		Double value9 = applicationContext.getBean("bangleSize", Double.class);
		System.out.println("bangleSize :" + value9);
	}

}
