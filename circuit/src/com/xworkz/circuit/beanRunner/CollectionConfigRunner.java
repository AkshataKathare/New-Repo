package com.xworkz.circuit.beanRunner;

import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.CollectionConfiguration;

public class CollectionConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CollectionConfiguration.class);

		System.out.println(applicationContext.getBeanDefinitionCount());
		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		List<String> listOfNames = applicationContext.getBean("names", List.class);
		listOfNames.forEach(System.out::println);

		List<Integer> numbers = applicationContext.getBean("versions", List.class);
		numbers.forEach(System.out::println);

		Set<String> groupOfTrainers = applicationContext.getBean("trainers", Set.class);
		groupOfTrainers.forEach(System.out::println);

		Set<Long> contactNos = applicationContext.getBean("phoneNos", Set.class);
		contactNos.forEach(System.out::println);

		Set<Integer> nos = applicationContext.getBean("values", Set.class);
		nos.forEach(System.out::println);
	}

}
