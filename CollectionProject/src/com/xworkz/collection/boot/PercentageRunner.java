package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;

public class PercentageRunner {

	public static void main(String[] args) {

		Collection<Double> percentages = new ArrayList<>();
		percentages.add(56.7);
		percentages.add(35.5);
		percentages.add(90.0);
		percentages.add(78.7);
		percentages.add(80.5);
		percentages.add(50.0);

		percentages.forEach(e -> System.out.println(e));

		System.out.println("filter only percentages less than 60");

		percentages.stream().filter(ele -> ele < 60).forEach(e -> System.out.println(e));

	}

}
