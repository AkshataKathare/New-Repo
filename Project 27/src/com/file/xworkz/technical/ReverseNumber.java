package com.file.xworkz.technical;

public class ReverseNumber {

	public static void main(String[] args) {

		int num = 46778;
		int rev = 0;
		while (num > 0) {
			int r = num % 10;
			rev = rev * 10 + r;
			num = num / 10;
//			r = num % 10;
//			System.out.print(r);
//			num = num / 10;
		}
		System.out.println("Reverse order :" + rev);

	}

}
