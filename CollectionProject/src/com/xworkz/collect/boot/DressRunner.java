package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class DressRunner {

	public static void main(String[] args) {

		Collection<String> whiskeys = new ArrayList<>();
		whiskeys.add("IB");
		whiskeys.add("Black & White");
		whiskeys.add("BD");
		whiskeys.add("CD");
		whiskeys.add("Blue & White");
		whiskeys.add("Johnnie Walker");
		whiskeys.add("Diageo");
		whiskeys.add("Bowmore");
		whiskeys.add("Macallan");
		whiskeys.add("Oban");
		whiskeys.add(null);
		whiskeys.add(null);

		System.out.println("Total :" + whiskeys.size());

		System.out.println("for each loop");

		for (String brand : whiskeys) {
			if (Objects.nonNull(brand)) {
				System.out.println(brand);
			}

		}

		Iterator<String> whiskeyBrand = whiskeys.iterator();
		while (whiskeyBrand.hasNext()) {
			System.out.println("element exists");
			String element = whiskeyBrand.next();
			System.out.println(element);
			if (Objects.isNull(element)) {
				whiskeyBrand.remove();
			}
		}

		System.out.println(whiskeys);
		System.out.println("whiskeys size :" + whiskeys.size());
	}

}