package com.file.xworkz.technical;

public class E4 {

	public static void main(String[] args) {
		int num=4;
		for (int i = 0; i <num; i++) {
			for (int j = 0; j <num; j++) {
				if (i == 0 && j == 0 || i == 0 && j == 1 || i == 0 && j == 2 || i == 0 && j == 3 || i == 1 && j == 0
						|| i == 1 && j == 3 || i == 2 && j == 0 || i == 2 && j == 1 || i == 2 && j == 2
						|| i == 2 && j == 3) {
					System.out.print("&  ");
				} else {
					System.out.print(" ");
				}
			}
		}

	}

}
