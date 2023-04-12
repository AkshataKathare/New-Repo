package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class SoilRunner {

	public static void main(String[] args) {

		Collection<String> soilTypes = new ArrayList<>();
		soilTypes.add("Red soil");
		soilTypes.add("Clay soil");
		soilTypes.add("Black soil");
		soilTypes.add("Grey soil");
		soilTypes.add("Sandy soil");
		soilTypes.add("Red soil");
		soilTypes.add("Clay soil");
		soilTypes.add("Black soil");
		soilTypes.add("Grey soil");
		soilTypes.add("Sandy soil");
		soilTypes.add("Red soil");
		soilTypes.add("Clay soil");
		soilTypes.add("Black soil");
		soilTypes.add("Grey soil");
		soilTypes.add("Sandy soil");
		soilTypes.add("Red soil");
		soilTypes.add("Clay soil");
		soilTypes.add("Black soil");
		soilTypes.add("Grey soil");
		soilTypes.add("Sandy soil");

		System.out.println("Total :" + soilTypes.size());

		String soil = "Red soil";

		boolean contain = soilTypes.contains(soil);
		System.out.println(contain);

		boolean removed = soilTypes.remove(soil);
		System.out.println(removed);

		System.out.println("After Removed :" + soilTypes.size());

		Collection<String> set = new HashSet<>(soilTypes);
		for (String type : set) {
			int occurence = Collections.frequency(soilTypes, type);
			System.out.println("Occurence of " + type + " is " + occurence + " times");
		}

		System.out.println("");

		Collection<String> soiTy = new ArrayList<String>();
		soiTy.add("loam");
		soiTy.add("silt");
		System.out.println("SoiType :" + soiTy);

		// addAll

		Collection<String> all = new ArrayList<>();
		all.addAll(soiTy);
		all.addAll(soilTypes);
		System.out.println("Types :" + all);

		// containsAll
		Collection<String> colle1 = new ArrayList<>();
		colle1.add("Dharwad");
		colle1.add("Shimoga");

		Collection<String> colle2 = new ArrayList<>();
		colle2.add("Dharwad");
		colle2.add("Shimoga");

		System.out.println("colle1 containsAll() :" + colle1.containsAll(colle2));
		System.out.println("colle2 containsAll() :" + colle2.containsAll(soiTy));
		// removeAll
		Collection<String> rem1 = new ArrayList<>();
		rem1.add("India");
		rem1.add("Sri Lanka");
		rem1.add("Bangladesh");

		Collection<String> rem2 = new ArrayList<>();
		rem2.add("India");
		rem2.add("Sri Lanka");
		rem2.add("Afghanistan");

		rem1.removeAll(rem2);
		System.out.println("rem1 :" + rem1);
		System.out.println("rem2 :" + rem2);

	}

}
