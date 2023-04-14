package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class FruitRunner {

	public static void main(String[] args) {

		Collection<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Water melon");
		fruits.add("Chikoo");
		fruits.add("Kiwi");
		fruits.add("DragonFruit");
		fruits.add("Pomegranate");
		fruits.add("Coconut");
		fruits.add("Papaya");
		fruits.add("Custard apple");
		fruits.add("BlueBerry");
		fruits.add("StrawBerry");
		fruits.add("Fig");
		fruits.add("Banana");
		fruits.add("Cherry");
		fruits.add("PineApple");
		fruits.add("Lemon");
		fruits.add("Mulberry");
		fruits.add("Avocado");
		fruits.add("Apricot");
		fruits.add("Peach");
		fruits.add("StarFruit");
		fruits.add("Plum");

		System.out.println("Printing the fruits in upperCase");

		fruits.stream().map(element -> element.toUpperCase()).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("Printing fruits if length is less than 5");

		fruits.stream().filter(fruit -> fruit.length() < 5).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("Printing fruits if length is greater than 5");

		fruits.stream().filter(fru -> fru.length() > 5).collect(Collectors.toList())
				.forEach(ele -> System.out.println(ele));

		System.out.println("Printing fruits if length is greater than 10 and less than 15");

		fruits.stream().filter(arg -> arg.length() > 10 && arg.length() < 15).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

	}

}
