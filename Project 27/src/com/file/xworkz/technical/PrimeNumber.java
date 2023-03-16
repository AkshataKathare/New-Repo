package com.file.xworkz.technical;

public class PrimeNumber {

	public static void main(String[] args) {

		int num = 20;
		boolean cond = false;
		for (int i = 2; i <= num; i++) {
			if (num % i == 0) {
                 System.out.println("It is a prime number");
                 cond=true;
                 break;
                 
			}
			if(!cond) {
				System.out.println("It is prime");
			}else {
				System.out.println("It is not prime");
			}
		}

	}

}
