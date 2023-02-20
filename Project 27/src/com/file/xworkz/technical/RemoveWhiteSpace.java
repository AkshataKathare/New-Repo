package com.file.xworkz.technical;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		String name = " a k s h a t a";
		// name = name.replaceAll("\\s", "");(In-built method)
		// System.out.println(name);

		char ch[] = name.toCharArray();
		String seq = "";

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ') {
				seq = seq + ch[i];
			}

		}
		System.out.println(seq);
	}

}
