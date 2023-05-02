package com.xworkz.circuit.beanConfiguration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.val;

@Configuration
public class CollectionConfiguration {

	@Bean
	public List<String> names() {
		System.out.println("Running names with ArrayList impl in CollectionConfiguration");
		List<String> list = new ArrayList<>();
		list.add("Akshata");
		list.add("Anita");
		list.add("Shubhangi");
		list.add("Arpita");
		list.add("Abhi");

		return list;
	}

	@Bean
	public List<Integer> versions() {
		System.out.println("Running versions with LinkedList impl in CollectionConfiguration");
		List<Integer> values = new LinkedList<>();
		values.add(23);
		values.add(78);
		values.add(28);
		values.add(99);
		values.add(101);
		values.add(108);

		return values;
	}

	@Bean
	public Set<String> trainers() {
		System.out.println("Running trainers with HashSet impl in CollectionConfiguration");
		Set<String> set = new HashSet<>();
		set.add("Omkar");
		set.add("Shanthanu");
		set.add("Lokesh");
		set.add("Sunil");
		set.add("Abhishek");
		return set;
	}

	@Bean
	public Set<Long> phoneNos() {
		System.out.println("Running phoneNos with LinkedHashSet impl in CollectionConfiguration");
		Set<Long> numbers = new LinkedHashSet<>();
		numbers.add(7204223793L);
		numbers.add(9620809927L);
		numbers.add(96208089928L);
		numbers.add(7847875728L);
		numbers.add(7204223747L);
		return numbers;
	}

	@Bean
	public Set<Integer> values() {
		System.out.println("Running phoneNos with TreeSet impl in CollectionConfiguration");
		Set<Integer> numbers = new TreeSet<>();
		numbers.add(67);
		numbers.add(189);
		numbers.add(26);
		numbers.add(78);
		numbers.add(123);
		numbers.add(56);
		return numbers;
	}
}
