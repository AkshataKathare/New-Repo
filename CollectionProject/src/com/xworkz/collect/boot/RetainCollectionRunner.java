package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;

public class RetainCollectionRunner {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList<>();
		names.add("Akshata");
		names.add("Abhishek");
		names.add("Arpita");
		names.add("Darshan");
		names.add("Sagar");
		names.add("Vikas");

		Collection<String> newNames = new ArrayList<>();
		newNames.add("Darshan");
		newNames.add("Arpita");
		newNames.add("Bindu");
		newNames.add("Pragyan");

		System.out.println("Names contains :" + names);
		System.out.println("new Names contains :" + newNames);

		System.out.println("After retainAll() method");

		boolean retained = names.retainAll(newNames);
		System.out.println(retained);
		System.out.println("Names contains :" + names);
		System.out.println("new Names contains :" + newNames);

	}

}
