package com.file.xworkz.technical;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 2;
		int b = 6;

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("a is "+a);
		System.out.println("b is "+b);

	}

}
