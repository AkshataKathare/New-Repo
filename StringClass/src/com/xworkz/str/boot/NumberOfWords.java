package com.xworkz.str.boot;

public class NumberOfWords {

	public static void main(String[] args) {
		String address = "Gandhi chowk Dharwad";
		String[] count = address.split(" ");
		int length = count.length;
		System.out.println(length);
		char ch[] = address.toCharArray();
		String rev = "";
		for (String seq : count) {
			if (count.equals("chowk")) {
				for (int i = seq.length() - 1; i > 0; i--) {
					rev = rev + ch[i];
				}
				System.out.println(rev);

			}
		}
	}

}
