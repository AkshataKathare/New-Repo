package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.ByteConfiguration;

public class ByteConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ByteConfiguration.class);

		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Byte val1 = applicationContext.getBean("age", Byte.class);
		System.out.println(val1);

		Byte val2 = applicationContext.getBean("classFloors", Byte.class);
		System.out.println(val2);

		Byte val3 = applicationContext.getBean("buildingFloors", Byte.class);
		System.out.println(val3);

		Byte val4 = applicationContext.getBean("value1", Byte.class);
		System.out.println(val4);

		Byte val5 = applicationContext.getBean("value2", Byte.class);
		System.out.println(val5);

		Byte val6 = applicationContext.getBean("value3", Byte.class);
		System.out.println(val6);

		Byte val7 = applicationContext.getBean("value4", Byte.class);
		System.out.println(val7);

		Byte val8 = applicationContext.getBean("value5", Byte.class);
		System.out.println(val8);

		Byte val9 = applicationContext.getBean("value6", Byte.class);
		System.out.println(val9);
	}

}
