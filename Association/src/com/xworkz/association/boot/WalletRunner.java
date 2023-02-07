package com.xworkz.association.boot;

import com.xworkz.association.things.Wallet;
import com.xworkz.association.things.Card;

public class WalletRunner {

	public static void main(String[] args) {
		Wallet wallet = new Wallet(true, "Black");
		wallet.display();

		System.out.println("===========");

		Card card = new Card("Credit card", 20000);
		wallet.init(card);
		wallet.display();

	}

}
