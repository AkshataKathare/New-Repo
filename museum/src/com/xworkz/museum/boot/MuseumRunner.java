package com.xworkz.museum.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.museum.configuration.MuseumConfiguration;
import com.xworkz.museum.things.Museum;

public class MuseumRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MuseumConfiguration.class);

		Museum museum = applicationContext.getBean(Museum.class);
		System.out.println(museum);
	}

}
