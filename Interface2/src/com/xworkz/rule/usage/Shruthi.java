package com.xworkz.rule.usage;

import com.xworkz.rule.things.GoldSeller;

public class Shruthi {
	private GoldSeller goldSeller;

	public Shruthi(GoldSeller goldSeller) {
		System.out.println("Const in Shruthi with DevendraSetu");
		this.goldSeller = goldSeller;
	}

	public void chinnaTago() {
		System.out.println("Running chinnaTago in Shruthi");
		double price = this.goldSeller.pricePerGram();
		String getGstNo = this.goldSeller.getGstNo();
		String getLocation = this.goldSeller.getLocation();
		if (price < 4000) {
			System.out.println("She will buy :" + price);
		} else {
			System.out.println("She will not buy :" + price);
		}
		System.out.println("GST No :" + getGstNo);
		System.out.println("Location :" + getLocation);

	}

}
