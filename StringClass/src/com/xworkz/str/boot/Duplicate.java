package com.xworkz.str.boot;

public class Duplicate {

	public static void main(String[] args) {

		String name = "akshata";
		int count = 0;
		char letter = 0;
		int length = name.length();
		char ch[] = name.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					letter = ch[i];
				}

			}
		}
		System.out.println("Repeated letter :" + letter);

		System.out.println("Repeated for " + count + " times");

	}
}