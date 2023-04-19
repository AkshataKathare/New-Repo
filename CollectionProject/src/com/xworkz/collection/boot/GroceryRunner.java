package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworkz.collection.dto.GroceryDTO;

public class GroceryRunner {

	public static void main(String[] args) {

		Set<GroceryDTO> groceries = new HashSet<>();
		groceries.add(new GroceryDTO(1, "Wheat", 200, 1));
		groceries.add(new GroceryDTO(2, "Jowar", 600, 2));
		groceries.add(new GroceryDTO(3, "Barley", 1000, 11));
		groceries.add(new GroceryDTO(4, "Paddy", 389.9, 6));
		groceries.add(new GroceryDTO(4, "Paddy", 389.9, 6));
		groceries.add(new GroceryDTO(5, "Moog Dal", 900, 4));
		groceries.forEach(e -> System.out.println(e));

		System.out.println("==================");

		System.out.println("Set converted to list");

		List<GroceryDTO> listGr = groceries.stream().collect(Collectors.toList());
		listGr.forEach(gro -> System.out.println(gro));

		System.out.println("=====================");

		System.out.println("Demo of get method with index");
		GroceryDTO getMet = listGr.get(3);
		System.out.println(getMet);

		System.out.println("Demo set method");
		listGr.set(1, new GroceryDTO(10, "Corn Flour", 250, 4));
		listGr.forEach(gr -> System.out.println(gr));

		System.out.println("Demo remove with index method");

		listGr.remove(2);
		listGr.forEach(gr -> System.out.println(gr));

		System.out.println("Add method in iterator");

		List<GroceryDTO> elements = new ArrayList<>();
		elements.add(new GroceryDTO(22, "Ghee", 300, 2));
		elements.forEach(s -> System.out.println(s));

		System.out.println("Iterator from reverse order");

		ListIterator<GroceryDTO> reverse = listGr.listIterator(listGr.size());
		while (reverse.hasPrevious()) {
			GroceryDTO previous = reverse.previous();
			int preInd = reverse.previousIndex();
			System.out.println("Previous index :" + preInd);
			System.out.println(previous);
			int nextIndex = reverse.nextIndex();
			System.out.println("nextIndex :" + nextIndex);
		}
		System.out.println("=============================");
		listGr.forEach(e -> System.out.println(e));

		System.out.println("Demo addAll with index");

		List<GroceryDTO> grs = new ArrayList<>();
		grs.add(new GroceryDTO(1, "Wheat", 200, 1));
		grs.add(new GroceryDTO(2, "Jowar", 600, 2));
		grs.add(new GroceryDTO(3, "Barley", 1000, 11));

		List<GroceryDTO> grs1 = new ArrayList<>();
		grs1.add(new GroceryDTO(1, "Salt", 200, 1));
		grs1.add(new GroceryDTO(2, "Tea powder", 600, 2));
		grs1.add(new GroceryDTO(3, "Sugar", 1000, 11));

		List<GroceryDTO> grs2 = new ArrayList<>();
		grs2.add(new GroceryDTO(1, "Salt", 200, 1));
		grs2.add(new GroceryDTO(2, "Tea powder", 600, 2));
		grs2.add(new GroceryDTO(3, "Sugar", 1000, 11));

		listGr.forEach(e -> System.out.println(e));

		System.out.println("");
		List<GroceryDTO> addAllHere = new ArrayList<>();
		addAllHere.addAll(0, grs);
		addAllHere.addAll(1, grs1);
		addAllHere.addAll(6, grs2);
		addAllHere.addAll(7, listGr);
		addAllHere.forEach(e -> System.out.println(e));

		List<GroceryDTO> things = new ArrayList<>();
		things.add(new GroceryDTO(1, "Wheat", 200, 1));
		things.add(new GroceryDTO(2, "Jowar", 600, 2));
		things.add(null);
		things.add(null);
		things.add(null);
		things.add(null);
		things.add(new GroceryDTO(2, "Jowar", 600, 2));

		GroceryDTO gro = new GroceryDTO(1, "Wheat", 200, 1);
		boolean contains = things.contains(gro);
		System.out.println("Contains :" + contains);

		things.forEach(e -> System.out.println(e));

		ListIterator<GroceryDTO> listIterat = things.listIterator();
//		int previousInd = listIterat.previousIndex();
//		System.out.println("Previous index :" + previousInd);

		System.out.println("===========");
		Set<GroceryDTO> vegies = new HashSet<>();
		vegies.add(new GroceryDTO(1, "Wheat", 200, 1));
		vegies.add(new GroceryDTO(2, "Jowar", 600, 2));
		vegies.add(null);
		vegies.add(null);
		vegies.add(null);
		vegies.add(null);
		vegies.forEach(e -> System.out.println(e));

	}

}
