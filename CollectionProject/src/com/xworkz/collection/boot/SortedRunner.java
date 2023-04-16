package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class SortedRunner {

	public static void main(String[] args) {

		Collection<String> elements = new ArrayList<>();
		elements.add("Akshata");
		elements.add("Vimal");
		elements.add("Dattatraya");
		elements.add("Abhishek");
		elements.add("Arpita");

		System.out.println("Sorting the String values in ascending order");

		elements.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("Sorting the String values in descending order");

		elements.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).forEach(e -> System.out.println(e));

		Collection<Integer> numbers = new ArrayList<>();
		numbers.add(100);
		numbers.add(2);
		numbers.add(24);
		numbers.add(400);
		numbers.add(180);

		System.out.println("Sorting the numbers in ascending order");

		numbers.stream().sorted().forEach(e -> System.out.println(e));

		System.out.println("Sorting the numbers in descending order");

		numbers.stream().sorted((ref1, ref2) -> {
			if (ref1 == ref2)
				return 0;
			if (ref2 > ref1)
				return 1;
			return -1;
		}).forEach(e -> System.out.println(e));

		// Or

		numbers.stream().sorted((ref1, ref2) -> ref2.compareTo(ref1)).forEach(e -> System.out.println(e));
	}

}
