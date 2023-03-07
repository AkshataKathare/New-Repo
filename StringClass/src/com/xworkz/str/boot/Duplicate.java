package com.xworkz.str.boot;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {

		String st = new String();
		String name = "aahh";
		int count = 0;
		int length = name.length();
		char ch[] = name.toCharArray();
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					char letter = ch[i];
					System.out.println(letter);
				}
			}
		}
		System.out.println(count);

	}
}