package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.CandyCrush;
import com.xworkz.inheritance.things.Game;

public class GameRunner {

	public static void main(String[] args) {

		CandyCrush candy = new CandyCrush();
		candy.entertainment();
		float data1 = candy.getData();
		System.out.println(data1);

		Game game = new CandyCrush();
		float data2 = game.getData();
		System.out.println(data2);

		CandyCrush candy2 = (CandyCrush) game;
		candy2.entertainment();

	}

}
