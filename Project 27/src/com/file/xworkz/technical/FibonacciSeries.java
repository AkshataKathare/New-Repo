package com.file.xworkz.technical;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num = 10;

		int first = 0;
		int second = 1;

		for (int i = first; i <= num; i++) {
			System.out.println(first);

			int next = first + second;
			first = second;
			second = next;
		}

	}

}
