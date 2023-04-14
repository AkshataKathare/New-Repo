package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PoliticalParty {

	public static void main(String[] args) {

		Collection<String> parties = new ArrayList<>();
		parties.add("bjp");
		parties.add("congress");
		parties.add("aap");
		parties.add("jds");

		System.out.println("Collect and print in upperCase");

		parties.stream().map((element -> element.toUpperCase())).collect(Collectors.toList())
				.forEach(ref -> System.out.println(ref));

		System.out.println("Collect and print in lowerCase");

		List<String> lowerCaseParties = parties.stream().map(ele -> ele.toLowerCase()).collect(Collectors.toList());
		for (String lower : lowerCaseParties) {
			System.out.println(lower);
		}

		Collection<String> convertedParties = new ArrayList<>();
		for (String conv : parties) {
			convertedParties.add(conv.toUpperCase());
		}
		System.out.println(convertedParties);

	}

}
