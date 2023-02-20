package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.Gold;

public class GoldRunner {

	public static void main(String[] args) {

		Gold gold1 = new Gold();
		gold1.setCost(788);
		gold1.setCostly(true);
		gold1.setJewellery("Necklace");
		gold1.setShop("Yashoda jewellers");
		System.out.println(gold1);
		System.out.println(gold1.hashCode() + "Original hashCode of gold1 :" + System.identityHashCode(gold1));

		System.out.println("           ");

		Gold gold2 = new Gold();
		gold2.setCost(400);
		gold2.setCostly(false);
		gold2.setJewellery("Bangle");
		gold2.setShop("Vimal Jewellers");
		System.out.println(gold2);
		System.out.println(gold2.hashCode() + "Original hashCode of gold2 :" + System.identityHashCode(gold2));

		System.out.println("           ");
		
		boolean equal = gold1.equals(gold2);
		System.out.println(equal);

	}

}
