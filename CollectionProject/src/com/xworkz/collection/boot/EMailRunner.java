package com.xworkz.collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class EMailRunner {

	public static void main(String[] args) {

		Collection<String> emails = new ArrayList<>();
		emails.add("akshata@gmail.com");
		emails.add("darshanmv@gmail.com");
		emails.add("shubhangi@gmail.com");
		emails.add("anita@gmail.com");
		emails.add("abhishek@gmail.com");
		emails.add("sagar@outlook.com");
		emails.add("vimal@outlook.com");
		emails.add("dattatraya@outlook.com");
		emails.add("arpita@outlook.com");
		emails.add("shobha@outlook.com");
		emails.add("vittal@yahoo.com");
		emails.add("annapurna@yahoo.com");
		emails.add("bindu@yahoo.com");
		emails.add("vikas@yahoo.com");
		emails.add("jayalaxmi@yahoo.com");
		emails.add("anusuya@xworkz.com");
		emails.add("savitri@xworkz.com");
		emails.add("shruti@xworkz.com");
		emails.add("bhairavi@xworkz.com");
		emails.add("priyanka@xworkz.com");
		emails.add("sanket@xworkz.com");
		emails.add("omkar@xworkz.com");
		emails.add("jayanth@xworkz.com");
		emails.add("dinakar@xworkz.com");
		emails.add("suchitra@xworkz.com");

		emails.stream().map(email -> email.toUpperCase()).collect(Collectors.toList())
				.forEach(em -> System.out.println(em));

		System.out.println("");

		System.out.println("emails ending with gmail.com");

		emails.stream().filter(emai -> emai.endsWith("gmail.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("");

		System.out.println("emails ending with xworkz.com");

		emails.stream().filter(emai -> emai.endsWith("xworkz.com")).collect(Collectors.toList())
				.forEach(e -> System.out.println(e));

		System.out.println("");

		System.out.println("emails which are not xworkz and gmail");

		emails.stream().filter(emai -> !emai.endsWith("xworkz.com") && !emai.endsWith("gmail.com"))
				.collect(Collectors.toList()).forEach(e -> System.out.println(e));

		Collection<String> un = new HashSet<>(emails);
		for (String unique : un) {
			boolean ends = unique.endsWith("@gmail.com");
			if (ends == true) {
				System.out.println(unique);
			}
		}
	}
}
