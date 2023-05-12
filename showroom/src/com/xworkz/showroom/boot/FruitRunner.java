package com.xworkz.showroom.boot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.thing.Fruit;

public class FruitRunner {

	public static void main(String[] args) {

//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Fruit.class);
//
//		AnnotationConfigApplicationContext config = (AnnotationConfigApplicationContext) applicationContext;
//		config.close();

		// here,we have to cast to sub-class

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Fruit.class)) {
			// this will automatically close the resource..
		}
	}

}
