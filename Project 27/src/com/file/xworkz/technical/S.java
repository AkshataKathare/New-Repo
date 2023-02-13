package com.file.xworkz.technical;

public class S {

	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 3; j++) {
				if (i == 1 && j == 1 || i == 1 && j == 2 || i == 1 && j == 3 || i == 2 && j == 1 || i == 3 && j == 1
						|| i == 3 && j == 2 || i == 3 && j == 3 || i == 4 && j == 3 || i == 5 && j == 1
						|| i == 5 && j == 2 || i == 5 && j == 3) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}

	}

}
