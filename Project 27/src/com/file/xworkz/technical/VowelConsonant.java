package com.file.xworkz.technical;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {

		System.out.println("Enter String name");

		Scanner sp = new Scanner(System.in);
		String name = sp.next();
		int countVowel = 0;
		int countCons = 0;

		char ch[] = name.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				System.out.println("Vowel " + ch[i]);
				countVowel += 1;
			} else {
				System.out.println("Consonant " + ch[i]);
				countCons += 1;
			}

		}
		System.out.println("Number of vowels :" + countVowel);
		System.out.println("Number of consonants :" + countCons);
	}

}
