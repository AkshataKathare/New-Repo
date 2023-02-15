package com.file.xworkz.technical;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 20;

		for (int i = 1; i <= num; i++) {
			if ((i % 2) != 0) {
				System.out.println("Prime number " +i);
			} else {
				System.out.println("Even number "+i);
			}
		}

	}

}
