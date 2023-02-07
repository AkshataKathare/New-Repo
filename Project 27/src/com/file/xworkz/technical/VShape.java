package com.file.xworkz.technical;

public class VShape {

	public static void main(String[] args) {
		int num = 8;
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 2 || i == 3 && j == 3 || i == 4 && j == 4 || i == 3 && j == 5
						|| i == 2 && j == 6 || i == 1 && j == 7) {
					System.out.print("* ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}