package com.file.xworkz.technical;

import java.util.Scanner;

public class StringReverseWithoutLength {

	public static void main(String[] args) {

		System.out.println("Enter the String name");

		Scanner sp = new Scanner(System.in);
		String name = sp.next();

		char ch[] = name.toCharArray();
		String rev = "";
		for (int i = ch.length - 1; i >= 0; i--) {

			rev += ch[i];// rev=rev+ch[i]
		}

		System.out.println("Original name :" + name);
		System.out.println("Reversed name :" + rev);
	}

}