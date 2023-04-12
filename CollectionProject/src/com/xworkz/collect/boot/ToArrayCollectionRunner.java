package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;

public class ToArrayCollectionRunner {

	public static void main(String[] args) {

		Collection<Integer> menShoeSize = new ArrayList<>();
		menShoeSize.add(5);
		menShoeSize.add(6);
		menShoeSize.add(7);
		menShoeSize.add(8);
		menShoeSize.add(9);
		menShoeSize.add(10);

		Object[] men = menShoeSize.toArray();
		for (int index = 0; index < men.length; index++) {
			System.out.println(men[index]);
			if (men[index].equals(7)) {
				System.out.println("Proper size :" + men[index]);
			}
		}

		System.out.println("toArray(array)");

		Integer[] shoeSize = menShoeSize.toArray(new Integer[0]);
		for (int j = 0; j < shoeSize.length; j++) {
			System.out.println(shoeSize[j]);
		}
	}

}
