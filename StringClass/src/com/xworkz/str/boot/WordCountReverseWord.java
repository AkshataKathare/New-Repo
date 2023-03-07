package com.xworkz.str.boot;

public class WordCountReverseWord {

	public static void main(String[] args) {
		String quote = "this is java class";
		String[] q = quote.split(" ");
		int count = 0;
		boolean occur = false;
		String rev = "";
		for (String s : q) {
			occur = s.contains("java");
			if (occur == true) {
				count++;
				char ch[] = s.toCharArray();
				for (int i = ch.length - 1; i >= 0; i--) {
					rev = rev + ch[i];
				}
				System.out.println(rev);
				System.out.println(count);

				System.out.println(
						quote.substring(0, 4)+" " + quote.substring(5, 7) +" "+ rev +" "+ 
				quote.substring(13, quote.length()));
			}

		}
	}

}
