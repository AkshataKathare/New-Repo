package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class MovieCast {

	public static void main(String[] args) {

		Collection<String> theatres = new ArrayList<>();
		theatres.add("Sangam");
		theatres.add("Pushpanjali");
		theatres.add("Padma");
		theatres.add("Vijaya");
		theatres.add("Laxmi");
		theatres.add("Geetanjali");
		theatres.add("PVR");
		theatres.add("AKshata");
		theatres.add("Anitha");
		theatres.add("Shubhangi");
		theatres.add(null);

		System.out.println("Total theatres :" + theatres.size());

		for (String val : theatres) {
			if (Objects.nonNull(val)) {
				System.out.println(val);
			}
		}
		Iterator<String> itera = theatres.iterator();
		while (itera.hasNext()) {
			System.out.println("element exists");
			String theatreName = itera.next();
			System.out.println(theatreName);
			if (Objects.isNull(theatreName)) {
				itera.remove();
			}
		}
		System.out.println(theatres);
		System.out.println(theatres.size());
	}

}
