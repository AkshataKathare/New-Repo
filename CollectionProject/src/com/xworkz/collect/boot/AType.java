package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AType {

	public static void main(String[] args) {

		Collection<String> wordDulicate = new ArrayList<String>();

		wordDulicate.add("Tom");
		wordDulicate.add("Jones");
		wordDulicate.add("Sam");
		wordDulicate.add("Jamie");
		wordDulicate.add("Robie");
		wordDulicate.add("Helen");
		wordDulicate.add("Tom");
		wordDulicate.add("Troy");
		wordDulicate.add("Mika");
		wordDulicate.add("Tom");
		wordDulicate.add(null);

		for (String s : wordDulicate) {
			System.out.println(s);
		}
		Iterator<String> name = wordDulicate.iterator();
		while (name.hasNext()) {
			System.out.println("element is present");
			System.out.println(name.next());
			if (Objects.isNull(wordDulicate)) {
				name.remove();
			}

		}

		System.out.println(wordDulicate.size());
	}

}
