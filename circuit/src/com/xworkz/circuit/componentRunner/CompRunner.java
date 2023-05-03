package com.xworkz.circuit.componentRunner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.circuit.component.Aeroplane;
import com.xworkz.circuit.component.Anklet;
import com.xworkz.circuit.component.Asylum;
import com.xworkz.circuit.component.Country;
import com.xworkz.circuit.component.Flower;
import com.xworkz.circuit.component.Laptop;
import com.xworkz.circuit.component.MyDetails;
import com.xworkz.circuit.component.Pizza;
import com.xworkz.circuit.component.Sweater;
import com.xworkz.circuit.component.Television;
import com.xworkz.circuit.component.Temple;
import com.xworkz.circuit.component.Train;
import com.xworkz.circuit.component.WaterBottle;
import com.xworkz.circuit.componentConfig.ComponentConfiguration;

public class CompRunner {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		System.out.println(applicationContext.getBeanDefinitionCount());

		Stream.of(applicationContext.getBeanDefinitionNames()).forEach(System.out::println);

		System.out.println("============Train===========");

		Train train = applicationContext.getBean(Train.class);
		Stream.of(train).forEach(System.out::println);
		String color = train.newColor();
		System.out.println("New Color :" + color);

		System.out.println("============Flower===========");

		Flower flower = applicationContext.getBean(Flower.class);
		Stream.of(flower).forEach(System.out::println);
		String pl = flower.place();
		System.out.println("Place :" + pl);

		System.out.println("============Sweater===========");

		Sweater sweater = applicationContext.getBean(Sweater.class);
		Stream.of(sweater).forEach(System.out::println);
		String shop = sweater.shopName();
		System.out.println("Shop name :" + shop);

		System.out.println("============Laptop===========");

		Laptop laptop = applicationContext.getBean(Laptop.class);
		Stream.of(laptop).forEach(System.out::println);
		boolean flip = laptop.fullFlip();
		System.out.println("Fully flips :" + flip);

		System.out.println("============MyDeatils===========");

		MyDetails details = applicationContext.getBean(MyDetails.class);
		Stream.of(details).forEach(System.out::println);
		String house = details.houseName();
		System.out.println("House name :" + house);

		System.out.println("============Country===========");
		Country country = applicationContext.getBean(Country.class);
		Stream.of(country).forEach(System.out::println);
		System.out.println(country.southNeighbour());

		System.out.println("============Aeroplane===========");
		Aeroplane aeroplane = applicationContext.getBean(Aeroplane.class);
		Stream.of(aeroplane).forEach(System.out::println);
		int helpline = aeroplane.helpLineNumber();
		System.out.println("Help line number :" + helpline);

		System.out.println("============Pizza===========");
		Pizza pizza = applicationContext.getBean(Pizza.class);
		Stream.of(pizza).forEach(System.out::println);
		String mode = pizza.mode();
		System.out.println("Mode of order :" + mode);

		System.out.println("============Telivision===========");
		Television television = applicationContext.getBean(Television.class);
		Stream.of(television).forEach(System.out::println);
		double delCharge = television.deliveryCharge();
		System.out.println("Delivery charge :" + delCharge);

		System.out.println("============Anklet===========");
		Anklet anklet = applicationContext.getBean(Anklet.class);
		Stream.of(anklet).forEach(System.out::println);
		String giftBy = anklet.giftedBy();
		System.out.println("Anklet gifted by :" + giftBy);

		System.out.println("============WaterBottle===========");
		WaterBottle bottle = applicationContext.getBean(WaterBottle.class);
		Stream.of(bottle).forEach(System.out::println);
		String paid = bottle.paidBy();
		System.out.println("Paid by :" + paid);

		System.out.println("============Asylum===========");
		Asylum asylum = applicationContext.getBean(Asylum.class);
		Stream.of(asylum).forEach(System.out::println);
		String city = asylum.city();
		System.out.println("City name :" + city);

		System.out.println("============Temple===========");
		Temple temple = applicationContext.getBean(Temple.class);
		Stream.of(temple).forEach(System.out::println);
		System.out.println("Pujari :" + temple.pujari());
	}

}
