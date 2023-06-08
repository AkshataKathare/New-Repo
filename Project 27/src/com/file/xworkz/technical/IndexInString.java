package com.file.xworkz.technical;

public class IndexInString {

	public static void main(String[] args) {

		String s = "akshata";
		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'a') {
				System.out.println("index of a :" + i);
			}
		}
	}

}
