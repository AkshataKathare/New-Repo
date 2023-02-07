package com.xworkz.association.boot;

import com.xworkz.association.things.Box;
import com.xworkz.association.things.Gift;

public class GiftRunner {

	public static void main(String[] args) {
		Gift gift = new Gift("Gift Centre", 10000);
		gift.display();

		System.out.println("=============");

		Box box = new Box(2, true);
		gift.init(box);
		gift.display();

	}

}
