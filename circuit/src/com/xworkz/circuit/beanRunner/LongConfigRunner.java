package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.LongConfiguration;

public class LongConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(LongConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Long arg1 = applicationContext.getBean("contactNo", Long.class);
		System.out.println(arg1);

		Long arg2 = applicationContext.getBean("fatherContactNo", Long.class);
		System.out.println(arg2);

		Long arg3 = applicationContext.getBean("pincodeOfDharwad", Long.class);
		System.out.println(arg3);

		Long arg4 = applicationContext.getBean("pincodeOfHubli", Long.class);
		System.out.println(arg4);

		Long arg5 = applicationContext.getBean("pincodeOfTumkur", Long.class);
		System.out.println(arg5);

	}

}
