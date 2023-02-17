package com.file.xworkz.technical;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Enter String name");

		Scanner sp = new Scanner(System.in);
		String name = sp.next();

		char ch[] = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {

			rev += ch[i];// rev=rev+ch[i]
		}
		System.out.println("Original :" + name);
		System.out.println("Reversed :" + rev);

		if (name.equals(rev)) {
			System.out.println("It is a palindrome");
		} else {
			System.out.println("It is not a palindrome");
		}

	}

}
