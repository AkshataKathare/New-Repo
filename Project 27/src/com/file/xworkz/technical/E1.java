package com.file.xworkz.technical;

public class E1 {

	public static void main(String[] args) {
		int num = 4;
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num; j++) {
				if (i == 1 && j == 1 || i == 2 && j == 1 || i == 2 && j == 2 || i == 3 && j == 1 || i == 3 && j == 2
						|| i == 3 && j == 3) {
					System.out.print(j + " ");
				} 
			}
			System.out.println();
		}

	}

}
