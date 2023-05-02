package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.FloatConfiguration;

public class FloatConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(FloatConfiguration.class);

		System.out.println(applicationContext.getBeanDefinitionCount());
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Float num1 = applicationContext.getBean("salary", Float.class);
		System.out.println("salary :" + num1);

		Float num2 = applicationContext.getBean("height", Float.class);
		System.out.println("height :" + num2);

		Float num3 = applicationContext.getBean("weight", Float.class);
		System.out.println("weight :" + num3);

		Float num4 = applicationContext.getBean("distance", Float.class);
		System.out.println("distance :" + num4);

		Float num5 = applicationContext.getBean("cost", Float.class);
		System.out.println("cost :" + num5);

		Float num6 = applicationContext.getBean("quantityOfMilk", Float.class);
		System.out.println("quantityOfMilk :" + num6);

		Float num7 = applicationContext.getBean("quantityOfRice", Float.class);
		System.out.println("quantityOfRice :" + num7);

		Float num8 = applicationContext.getBean("wheatPrice", Float.class);
		System.out.println("wheatPrice :" + num8);

		Float num9 = applicationContext.getBean("dosaLength", Float.class);
		System.out.println("dosaLength :" + num9);
	}

}
