package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class InsertionOrder {

	public static void main(String[] args) {

		Map<Integer, String> names = new HashMap<>();
		names.put(21, "Akshata");
		names.put(20, "Anita");
		names.put(25, "Abhilasha");
		names.put(24, "Likhitha");
		names.put(23, "Ramya");
		names.put(22, "Parveen");

		System.out.println("Hash map :" + names);

		Map<Integer, String> links = new LinkedHashMap<>();
		links.put(21, "Akshata");
		links.put(20, "Anita");
		links.put(25, "Abhilasha");
		links.put(24, "Likhitha");
		links.put(23, "Ramya");
		links.put(22, "Parveen");

		System.out.println("Linked HashMap :" + links);

		Map<Integer, String> trees = new TreeMap<>();
		trees.put(21, "Akshata");
		trees.put(20, "Anita");
		trees.put(25, "Abhilasha");
		trees.put(24, "Likhitha");
		trees.put(23, "Ramya");
		trees.put(22, "Parveen");

		System.out.println("Tree Map :" + trees);
	}

}
