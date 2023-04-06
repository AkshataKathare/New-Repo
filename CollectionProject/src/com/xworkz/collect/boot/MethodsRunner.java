package com.xworkz.collect.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class MethodsRunner {

	public static void main(String[] args) {

		Collection<String> names = new ArrayList<>();
		names.add("Akshata");
		names.add("Anitha");
		names.add("Shubhangi");
		names.add("Vimal");
		names.add("Darshan");
		names.add("Dattatraya");
		names.add("Sagar");
		names.add("Vikas");
		names.add("Abhishek");
		names.add("Arpita");
		System.out.println("Number of names :" + names.size());
		names.clear();
		System.out.println("Number of names :" + names.size());

		System.out.println("*******");

		Collection<Integer> age = new LinkedList<>();
		age.add(5);
		age.add(11);
		age.add(4);
		age.add(20);
		age.add(3);
		age.add(35);
		age.add(12);
		age.add(78);
		age.add(90);
		age.add(100);
		System.out.println("Number of Age saved :" + age.size());

		System.out.println("*******");

		Collection<Byte> block = new HashSet<>();
		block.add((byte) 2);
		block.add((byte) 10);
		block.add((byte) 12);
		block.add((byte) 21);
		block.add((byte) 34);
		block.add((byte) 27);
		block.add((byte) 20);
		block.add((byte) 44);
		block.add((byte) 1);
		block.add((byte) 5);
		System.out.println("Number od Blocks saved :" + block.size());

		System.out.println("*******");

		Collection<Short> roomNo = new LinkedHashSet<>();
		roomNo.add((short) 1);
		roomNo.add((short) 3);
		roomNo.add((short) 10);
		roomNo.add((short) 13);
		roomNo.add((short) 15);
		roomNo.add((short) 11);
		roomNo.add((short) 20);
		roomNo.add((short) 27);
		roomNo.add((short) 22);
		roomNo.add((short) 20);
		roomNo.add((short) 80);
		System.out.println("Number of roomNos :" + roomNo.size());

		System.out.println("*******");

		Collection<Long> pinCode = new TreeSet<>();
		pinCode.add(580001L);
		pinCode.add(580002L);
		pinCode.add(580021L);
		pinCode.add(580051L);
		pinCode.add(580801L);
		pinCode.add(590001L);
		pinCode.add(590091L);
		pinCode.add(590021L);
		pinCode.add(590001L);
		pinCode.add(5900907L);
		pinCode.add(59009807L);
		System.out.println("Number of pinCodes saved:" + pinCode.size());

		System.out.println("*******");

		Collection<Double> height = new ArrayList<>();
		height.add(3.4);
		height.add(4.5);
		height.add(5.3);
		height.add(4.5);
		height.add(3.4);
		height.add(6.5);
		height.add(3.3);
		height.add(7.5);
		height.add(8.3);
		height.add(9.5);
		System.out.println("Number of heights saved :" + height.size());

		System.out.println("*******");

		Collection<Character> grade = new LinkedHashSet<>();
		grade.add('A');
		grade.add('B');
		grade.add('C');
		grade.add('F');
		grade.add('H');
		grade.add('X');
		grade.add('O');
		grade.add('P');
		grade.add('Y');
		grade.add('J');
		System.out.println("Number of grades saved :" + grade.size());

		System.out.println("*******");

		Collection<Boolean> good = new LinkedList<Boolean>();
		good.add(false);
		good.add(true);
		good.add(false);
		good.add(true);
		good.add(false);
		good.add(false);
		good.add(true);
		good.add(false);
		good.add(true);
		good.add(false);
		System.out.println("Number of boolean values saved :" + good.size());

		Collection<Float> weight = new ArrayList<>();
		weight.add((float) 23.5);
		weight.add((float) 45.5);
		weight.add((float) 78.5);
		weight.add((float) 38.5);
		weight.add((float) 45.5);
		weight.add((float) 56.5);
		weight.add((float) 77.5);
		weight.add((float) 80.5);
		weight.add((float) 58.5);
		weight.add((float) 34.5);
		System.out.println("Number of weights saved :" + weight.size());
	}

}
