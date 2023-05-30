package com.file.xworkz.technical;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num = 371;

		int temp = num;
		int r, sum = 0;

		while (num > 0) {
			r = num % 10;
			sum = sum + r * r * r;
			System.out.println(sum);
			num = num / 10;
		}

		if (temp == sum) {
			System.out.println("This is an Armstrong number " + temp);
		} else {
			System.out.println("This is not an armstrong number " + temp);
		}
	}

}
