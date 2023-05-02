package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.StringConfiguration;

public class StringConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(StringConfiguration.class);
		int count = applicationContext.getBeanDefinitionCount();
		System.out.println(count);
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(e -> System.out.println(e));

		String config = applicationContext.getBean("soil", String.class);
		System.out.println("Soil name :" + config);

		String config2 = applicationContext.getBean("name", String.class);
		System.out.println("Name :" + config2);

		String config3 = applicationContext.getBean("city", String.class);
		System.out.println("City :" + config3);

		String config4 = applicationContext.getBean("state", String.class);
		System.out.println("State :" + config4);

		String config5 = applicationContext.getBean("country", String.class);
		System.out.println("Country :" + config5);

		String config6 = applicationContext.getBean("continent", String.class);
		System.out.println("Continent :" + config6);

		String config7 = applicationContext.getBean("address", String.class);
		System.out.println("Address :" + config7);

		String config8 = applicationContext.getBean("motherName", String.class);
		System.out.println("Mother name :" + config8);

		String config9 = applicationContext.getBean("fatherName", String.class);
		System.out.println("Father name :" + config9);

		String config10 = applicationContext.getBean("brother", String.class);
		System.out.println("Brother :" + config10);

		String config11 = applicationContext.getBean("sister", String.class);
		System.out.println("Sister :" + config11);

		String config12 = applicationContext.getBean("grandMother", String.class);
		System.out.println("Grand mother :" + config12);

		String config13 = applicationContext.getBean("grandFather", String.class);
		System.out.println("Grandfather :" + config13);

		String config14 = applicationContext.getBean("aunty", String.class);
		System.out.println("Aunty :" + config14);

		String config15 = applicationContext.getBean("uncle", String.class);
		System.out.println("Uncle :" + config15);
	}

}
