package com.xworkz.inheritance.boot;

import com.xworkz.inheritance.things.Feb14;
import com.xworkz.inheritance.things.ValentineDay;

public class ValentineRunner {

	public static void main(String[] args) {

		Feb14 feb = new Feb14();
		feb.blackDay();
		boolean spec1 = feb.getSpecial();
		System.out.println(spec1);

		ValentineDay valentineDay = new Feb14();
		boolean spec2 = valentineDay.getSpecial();
		System.out.println(spec2);

		Feb14 feb14 = (Feb14) valentineDay;
		feb14.blackDay();

	}

}
