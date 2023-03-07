package com.xworkz.str.boot;

public class CompareString {

	public static void main(String[] args) {
		String name1 = "akshata";
		String name2 = "vimal";

		int num = name1.compareTo(name2);
		System.out.println(num);

		String one = name1.toString();
		String two = name2.toString();

		int nm = one.compareTo(two);
	}

}
