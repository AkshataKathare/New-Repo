package com.file.xworkz.technical;

import java.util.Scanner;

public class CountChar {
	public static void main(String[] args) {

		System.out.println("Enter String name");

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		char ch[] = name.toCharArray();
		int countChar = 0;
		int countSpace = 0;

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == ' ') {
				countSpace += 1;
			} else {
				countChar += 1;

			}
		}
		System.out.println("Number of characters :" + countChar);
		System.out.println("Number of space " + countSpace);

	}

}
