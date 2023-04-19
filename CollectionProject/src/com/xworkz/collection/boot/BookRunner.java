package com.xworkz.collection.boot;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

import com.xworkz.collection.dto.BookDTO;

public class BookRunner {

	public static void main(String[] args) {

		Set<BookDTO> setOfBooks = new HashSet<>();
		setOfBooks.add(new BookDTO("Wings of fire", 500, 45));
		setOfBooks.add(new BookDTO("Attitude is everything", 900.50, 256));
		setOfBooks.add(new BookDTO("Who will cry when you die", 1298, 567));
		setOfBooks.add(new BookDTO("Who will cry when you die", 1298, 567));
		setOfBooks.add(new BookDTO("Attitude is everything", 900.50, 489));

		setOfBooks.forEach(book -> System.out.println(book));

		System.out.println("Sorting");
		setOfBooks.stream().sorted().forEach(b -> System.out.println(b));

	}

}
