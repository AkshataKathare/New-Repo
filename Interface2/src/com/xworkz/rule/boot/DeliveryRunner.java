package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Dunzo;
import com.xworkz.rule.implementation.Rapido;
import com.xworkz.rule.things.Delivery;
import com.xworkz.rule.usage.Person;

public class DeliveryRunner {

	public static void main(String[] args) {

		Delivery delivery = new Dunzo();

		Person person = new Person(delivery);
		person.check();

		System.out.println("    ");

		Delivery delivery1 = new Rapido();

		Person person1 = new Person(delivery1);
		person1.check();

	}

}
