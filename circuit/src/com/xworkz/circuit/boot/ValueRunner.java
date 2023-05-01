package com.xworkz.circuit.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.thing2.Barber;
import com.xworkz.circuit.thing2.Chair;
import com.xworkz.circuit.thing2.HairDryer;
import com.xworkz.circuit.thing2.Mirror;
import com.xworkz.circuit.thing2.Saloon;
import com.xworkz.circuit.thing2.Scissor;
import com.xworkz.circuit.thing2.ShavingCream;
import com.xworkz.circuit.thing2.Trimmer;
import com.xworkz.configuration.ValueConfiguration;

public class ValueRunner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ValueConfiguration.class);

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);
		int count = applicationContext.getBeanDefinitionCount();
		System.out.println(count);

//		for (int i = 0; i < beans.length; i++) {
//			System.out.println(beans[i]);
//		}
		/*
		 * for (String bean : beans) { System.out.println(bean); }
		 */
		System.out.println("Saloon");
		Saloon saloon = applicationContext.getBean(Saloon.class);
		Stream.of(saloon).forEach(System.out::println);

		System.out.println("Scissor");
		Scissor scissor = applicationContext.getBean(Scissor.class);
		Stream.of(scissor).forEach(System.out::println);

		System.out.println("Chair");
		Chair chair = applicationContext.getBean(Chair.class);
		Stream.of(chair).forEach(System.out::println);

		System.out.println("Barber");
		Barber barber = applicationContext.getBean(Barber.class);
		Stream.of(barber).forEach(System.out::println);

		System.out.println("HairDryer");
		HairDryer dryer = applicationContext.getBean(HairDryer.class);
		Stream.of(dryer).forEach(System.out::println);

		System.out.println("Mirror");
		Mirror mirror = applicationContext.getBean(Mirror.class);
		Stream.of(mirror).forEach(System.out::println);

		System.out.println("ShavingCream");
		ShavingCream cream = applicationContext.getBean(ShavingCream.class);
		Stream.of(cream).forEach(System.out::println);
		
		System.out.println("Trimmer");
		Trimmer trimmer=applicationContext.getBean(Trimmer.class);
		Stream.of(trimmer).forEach(System.out::println);
	}

}
