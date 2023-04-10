package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class ExamSchedule {

	public static void main(String[] args) {

		Collection<String> examTimeTable = new ArrayList<>();
		examTimeTable.add("Akshata-Monday");
		examTimeTable.add("Shubhangi-Monday");
		examTimeTable.add("Anitha-Tuesday");
		examTimeTable.add("Shruthi-Tuesday");
		examTimeTable.add("Savitri-Wednesday");
		examTimeTable.add("Bhairavi-Wednesday");
		examTimeTable.add("Priyanka-Thursday");
		examTimeTable.add("Irfan-Thursday");
		examTimeTable.add("Jayanth-Friday");
		examTimeTable.add("Dinakar-Friday");
		examTimeTable.add(null);

		System.out.println("Total :" + examTimeTable.size());

		for (String exam : examTimeTable) {
			if (Objects.nonNull(exam)) {
				System.out.println(exam);
			}
		}

		Iterator<String> iter = examTimeTable.iterator();
		while (iter.hasNext()) {
			System.out.println("element exists");
			String element = iter.next();
			System.out.println(element);
			if (Objects.isNull(element)) {
				iter.remove();
			}
		}
		System.out.println(examTimeTable);
		System.out.println("examTimeTable size :" + examTimeTable.size());
	}

}
