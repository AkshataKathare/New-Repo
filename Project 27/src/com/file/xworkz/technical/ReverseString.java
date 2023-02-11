package com.file.xworkz.technical;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Akshata";
		String rev = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);
			System.out.println(i);
			System.out.println(rev);
		}
		System.out.println(rev);
	}

}
