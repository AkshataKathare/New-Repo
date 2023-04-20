package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class SoftwareCourses {

	public static void main(String[] args) {

		Map<Integer, String> courses = new HashMap<>();
		courses.put(30000, "Java");
		courses.put(45000, "Python");
		courses.put(24000, "C++");
		courses.put(45678, "C");
		courses.put(56000, "Javascript");
		courses.put(10000, "SQL");
		courses.put(35000, "CSS");
		courses.put(40000, "HTML");
		courses.put(20000, "JDBC");
		courses.put(3698, "Spring");

		System.out.println(courses);

		String course = courses.get(45000);
		System.out.println(course);

		courses.replace(24000, "Hibernate");
		System.out.println(courses);

		courses.clear();
		System.out.println(courses);
	}

}
