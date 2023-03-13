package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Abharan;
import com.xworkz.rule.implementation.DevendraSetu;
import com.xworkz.rule.implementation.Mahalakshmi;
import com.xworkz.rule.implementation.Malabar;
import com.xworkz.rule.things.GoldSeller;
import com.xworkz.rule.usage.Anitha;
import com.xworkz.rule.usage.Bhairavi;
import com.xworkz.rule.usage.Priyanka;
import com.xworkz.rule.usage.Shruthi;

public class GoldSellerRunner {

	public static void main(String[] args) {
		GoldSeller goldSeller = new Malabar();
		Bhairavi bhairavi = new Bhairavi(goldSeller);
		bhairavi.BangaraKharidi();

		System.out.println("      ");

		GoldSeller goldSeller1 = new DevendraSetu();
		Shruthi shruthi = new Shruthi(goldSeller1);
		shruthi.chinnaTago();

		System.out.println("      ");

		GoldSeller goldSeller2 = new Mahalakshmi();
		Priyanka priyanka = new Priyanka(goldSeller2);
		priyanka.purchaseGold();
		
		System.out.println("      ");

		GoldSeller goldSeller3 = new Abharan();
		Anitha anitha = new Anitha(goldSeller3);
		anitha.buyGold();

	}

}
