package com.file.xworkz.technical;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a = 0;

		for (int b = 0; b <= 10; b++) {
			int c = a + b;
			a = b;
			b = c;

			System.out.println(c);
		}

	}

}
