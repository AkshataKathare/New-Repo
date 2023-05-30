package com.xworkz.str.boot;

public class NumberOfWords {

	public static void main(String[] args) {
		String address = "Gandhi chowk Dharwad";
		String[] count = address.split(" ");
		int length = count.length;
		char ch[] = address.toCharArray();
		String rev = "";
		for (String seq : count) {
			if (count.equals("chowk")) {
				for (int i = seq.length() - 1; i >= 0; i--) {
					rev += seq.charAt(i);
				}
			}
		}
		System.out.println(address.substring(0, 6) + " " + rev + " " + address.substring(13, address.length()));

		System.out.println("Number of words :" + length);
	}

}
