package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

public class AttendanceSheetRunner {

	public static void main(String[] args) {

		Collection<Integer> months = new ArrayList<>();
		months.add(1);
		months.add(2);
		months.add(3);
		months.add(4);
		months.add(5);
		months.add(6);
		months.add(7);
		months.add(8);
		months.add(9);
		months.add(10);
		months.add(null);

		System.out.println("Total :" + months.size());

		for (Integer month : months) {
			if (Objects.nonNull(month)) {
				System.out.println(month);
			}
		}

		Iterator<Integer> value = months.iterator();
		while (value.hasNext()) {
			System.out.println("element exists");
			Integer val = value.next();
			System.out.println(val);
			if (Objects.isNull(val)) {
				value.remove();
			}
		}
		System.out.println(months);
		System.out.println("Size of months :" + months.size());
	}

}
