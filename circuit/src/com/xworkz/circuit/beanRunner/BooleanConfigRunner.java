package com.xworkz.circuit.beanRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.beanConfiguration.BooleanConfiguration;

public class BooleanConfigRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(BooleanConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		Boolean cond = applicationContext.getBean("female", Boolean.class);
		System.out.println("female :" + cond);

		Boolean cond2 = applicationContext.getBean("male", Boolean.class);
		System.out.println("male :" + cond2);

		Boolean cond3 = applicationContext.getBean("married", Boolean.class);
		System.out.println("married :" + cond3);

		Boolean cond4 = applicationContext.getBean("unmarried", Boolean.class);
		System.out.println("unmarried :" + cond4);

		Boolean cond5 = applicationContext.getBean("studying", Boolean.class);
		System.out.println("studying :" + cond5);

		Boolean cond6 = applicationContext.getBean("working", Boolean.class);
		System.out.println("working :" + cond6);

		Boolean cond7 = applicationContext.getBean("singer", Boolean.class);
		System.out.println("singer :" + cond7);
	}

}
