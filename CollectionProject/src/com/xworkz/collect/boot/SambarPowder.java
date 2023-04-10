package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class SambarPowder {

	public static void main(String[] args) {

		Collection<String> ingredients = new ArrayList<>();
		ingredients.add("Coriander seeds");
		ingredients.add("Cumin seeds");
		ingredients.add("Red chillie");
		ingredients.add("Fenugreek");
		ingredients.add("Black pepper");
		ingredients.add("Chana dal");
		ingredients.add("Urad dal");
		ingredients.add("Curry leaves");
		ingredients.add("Dried onion");
		ingredients.add("Clove leaves");
		ingredients.add(null);

		System.out.println("Total ingredients :" + ingredients.size());

		for (String ing : ingredients) {
			if (Objects.nonNull(ing)) {
				System.out.println(ing);
			}
		}
		Iterator<String> iterat = ingredients.iterator();
		while (iterat.hasNext()) {
			System.out.println("element exists");
			String ele = iterat.next();
			System.out.println(ele);
			if (Objects.isNull(ele)) {
				iterat.remove();
			}
		}
		System.out.println(ingredients);
		System.out.println("Final size after remove :" + ingredients.size());
	}

}
