package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Company {

	public static void main(String[] args) {

		Map<Float, String> companies = new HashMap<>();
		companies.put(23.5f, "Wipro");
		companies.put(45f, "Vrize");
		companies.put(67f, "Happiest Minds");
		companies.put(18f, "Capgemini");
		companies.put(15f, "IBM");
		companies.put(20.8f, "Google");
		companies.put(234f, "Microsoft");
		companies.put(356f, "Intel");
		companies.put(256.89f, "Societe Generale");
		companies.put(38.90f, "Apple");

		System.out.println(companies.values());

		System.out.println(companies.keySet());

		System.out.println(companies);

		String company = companies.getOrDefault(15f, null);
		System.out.println(company);

		companies.replace(18f, "Redmi");
		System.out.println(companies);

		companies.clear();
		System.out.println(companies);
	}

}
