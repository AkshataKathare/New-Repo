package com.file.xworkz.boot;

import com.file.xworkz.thing.CupBoard;

public class CupBoardRunner {

	public static void main(String[] args) {

		CupBoard cupBoard = new CupBoard("Cream");
		cupBoard.display();

		System.out.println("===================");

		CupBoard cupBoard1 = new CupBoard(true);
		cupBoard1.display();

		System.out.println("===================");

		CupBoard cupBoard2 = new CupBoard(10, 20);
		cupBoard2.display();

		System.out.println("===================");

		CupBoard cupBoard3 = new CupBoard(15000F, 'A');
		cupBoard3.display();

		System.out.println("===================");

		CupBoard cupBoard4 = new CupBoard();
		cupBoard4.init("Brown", false, 20, 30, 20000, 'B');
		cupBoard4.display();

	}

}
