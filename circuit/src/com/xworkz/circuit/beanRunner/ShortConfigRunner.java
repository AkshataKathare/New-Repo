package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.ShortConfiguration;

public class ShortConfigRunner {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ShortConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Short val1 = applicationContext.getBean("age", Short.class);
		System.out.println(val1);

		Short val2 = applicationContext.getBean("classFloors", Short.class);
		System.out.println(val2);

		Short val3 = applicationContext.getBean("buildingFloors", Short.class);
		System.out.println(val3);

		Short val4 = applicationContext.getBean("value1", Short.class);
		System.out.println(val4);

		Short val5 = applicationContext.getBean("value2", Short.class);
		System.out.println(val5);

		Short val6 = applicationContext.getBean("value3", Short.class);
		System.out.println(val6);

		Short val7 = applicationContext.getBean("value4", Short.class);
		System.out.println(val7);

		Short val8 = applicationContext.getBean("value5", Short.class);
		System.out.println(val8);

		Short val9 = applicationContext.getBean("value6", Short.class);
		System.out.println(val9);
	}
}
