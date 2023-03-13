package com.xworkz.rule.usage;

import com.xworkz.rule.things.GoldSeller;

public class Priyanka {

	private GoldSeller goldSeller;

	public Priyanka(GoldSeller goldSeller) {
		System.out.println("Const in Priyanka with Mahalakshmi");
		this.goldSeller = goldSeller;
	}

	public void purchaseGold() {
		System.out.println("Running purchaseGold in Priyanka");
		double price = this.goldSeller.pricePerGram();
		String getGstNo = this.goldSeller.getGstNo();
		String getLocation = this.goldSeller.getLocation();

		if (price < 4500) {
			System.out.println("She will buy");
		} else {
			System.out.println("She will not buy");
		}
		System.out.println("GST No :" + getGstNo);
		System.out.println("Location :" + getLocation);
	}

}
