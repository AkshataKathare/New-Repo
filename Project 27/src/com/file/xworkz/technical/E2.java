package com.file.xworkz.technical;

public class E2 {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			for (int j = 1; j < 4; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 1 || i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2
						|| i == 3 && j == 3) {
					System.out.print(j + " ");
				} else {
					System.out.println(" ");
				}
			}
		}

	}

}
