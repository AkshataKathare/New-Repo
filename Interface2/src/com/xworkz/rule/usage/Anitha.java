package com.xworkz.rule.usage;

import com.xworkz.rule.things.GoldSeller;

public class Anitha {
	private GoldSeller goldSeller;

	public Anitha(GoldSeller goldSeller) {
		System.out.println("Const in Anitha with Abharan");
		this.goldSeller = goldSeller;
	}

	public void buyGold() {
		System.out.println("Running buyGold in Anitha");
		double price = this.goldSeller.pricePerGram();
		String getGstNo = this.goldSeller.getGstNo();
		String getLocation = this.goldSeller.getLocation();

		if (price < 5000) {
			System.out.println("She will buy");
		} else {
			System.out.println("She will not buy");
		}
		System.out.println("GST No :" + getGstNo);
		System.out.println("Location :" + getLocation);
	}

}
