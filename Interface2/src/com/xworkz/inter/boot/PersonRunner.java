package com.xworkz.inter.boot;

import com.xworkz.inter.things.PassportRule;
import com.xworkz.inter.things.Person;

public class PersonRunner {

	public static void main(String[] args) {

		Person person = new Person();
		System.out.println(person.citizen());
		System.out.println(person.criminalRecord());
		System.out.println(person.jail());
		System.out.println(person.maxGoldLimit());
		System.out.println(person.minAmount());
		System.out.println(person.stayingHotel());

		System.out.println("           ");

		PassportRule passportRule = new Person();
		System.out.println(passportRule.citizen());
		System.out.println(passportRule.criminalRecord());
		System.out.println(passportRule.jail());

	}

}
