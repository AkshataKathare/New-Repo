package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.CharConfiguration;

public class CharConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CharConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Character char1 = applicationContext.getBean("div1", Character.class);
		System.out.println(char1);

		Character char2 = applicationContext.getBean("div2", Character.class);
		System.out.println(char2);

		Character char3 = applicationContext.getBean("div3", Character.class);
		System.out.println(char3);

		Character char4 = applicationContext.getBean("div4", Character.class);
		System.out.println(char4);

		Character char5 = applicationContext.getBean("div5", Character.class);
		System.out.println(char5);

		Character char6 = applicationContext.getBean("div6", Character.class);
		System.out.println(char6);

	}

}
