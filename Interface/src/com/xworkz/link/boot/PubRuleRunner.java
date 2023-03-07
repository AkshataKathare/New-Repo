package com.xworkz.link.boot;

import com.xworkz.link.things.People;

public class PubRuleRunner {

	public static void main(String[] args) {

		People people = new People();
		System.out.println(people.activity1());
		System.out.println(people.activity2());
		System.out.println(people.alwaysOpen());
		System.out.println(people.drinks());
		System.out.println(people.entryPrice());
		System.out.println(people.equals(people));
		System.out.println(people.hashCode());
		System.out.println(people.toString());
		System.out.println(people.getClass());

	}

}
