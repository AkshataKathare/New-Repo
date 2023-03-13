package com.xworkz.rule.usage;

import com.xworkz.rule.things.GoldSeller;

public class Bhairavi {
	private GoldSeller goldSeller;

	public Bhairavi(GoldSeller goldSeller) {
		System.out.println("Const in Bhairavi with Malabar");
		this.goldSeller = goldSeller;
	}

	public void BangaraKharidi() {
		System.out.println("Running BangaraKharidi in Bhairavi");
		double price = this.goldSeller.pricePerGram();
		String getGstNo = this.goldSeller.getGstNo();
		String getLocation = this.goldSeller.getLocation();

		if (price < 6000 && price > 4500) {
			System.out.println("She will buy :" + price);
		} else {
			System.out.println("She will not buy :" + price);
		}
		System.out.println("GST No :" + getGstNo);
		System.out.println("Location :" + getLocation);
	}

}
