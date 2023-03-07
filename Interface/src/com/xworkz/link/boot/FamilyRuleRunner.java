package com.xworkz.link.boot;

import com.xworkz.link.things.FamilyRule;
import com.xworkz.link.things.Members;

public class FamilyRuleRunner {

	public static void main(String[] args) {

		Members members = new Members();
		boolean attend = members.attendFamilyFunctions();
		System.out.println(attend);
		boolean independent = members.beingIndependent();
		System.out.println(independent);
		double breakFast = members.breakFastTime();
		System.out.println(breakFast);
		String care = members.careFor();
		System.out.println(care);
		double limit = members.limitTime();
		System.out.println(limit);
		double lunch = members.lunchTime();
		System.out.println(lunch);
		int min = members.minMembers();
		System.out.println(min);
		boolean pray = members.pray();
		System.out.println(pray);
		String respect = members.respectTo();
		System.out.println(respect);
		boolean returnHome = members.returnHomeOnTime();
		System.out.println(returnHome);
		boolean sleep = members.sleepOnTime();
		System.out.println(sleep);
		double snacks = members.snacksTime();
		System.out.println(snacks);
		double tea = members.teaTime();
		System.out.println(tea);
		boolean unity = members.unity();
		System.out.println(unity);
		double wakeUp = members.wakeUpTime();
		System.out.println(wakeUp);
		System.out.println(members.equals(respect));
		System.out.println(members.hashCode());
		System.out.println(members.toString());
		System.out.println(members.getClass());

		FamilyRule family = new Members();
		boolean function = family.attendFamilyFunctions();
		System.out.println(function);
		boolean being = family.beingIndependent();
		System.out.println(being);
		double breakFast1 = family.breakFastTime();
		System.out.println(breakFast1);
		String careFor = family.careFor();
		System.out.println(careFor);
		double limit1 = family.limitTime();
		System.out.println(limit1);
		double lunch1 = family.lunchTime();
		System.out.println(lunch1);
		int min1 = family.minMembers();
		System.out.println(min1);
		boolean pray1 = family.pray();
		System.out.println(pray1);
		String respect1 = family.respectTo();
		System.out.println(respect1);
		boolean returnHome1 = family.returnHomeOnTime();
		System.out.println(returnHome1);
		boolean sleep1 = family.sleepOnTime();
		System.out.println(sleep1);
		double snacks1 = family.snacksTime();
		System.out.println(snacks1);
		double tea1 = family.teaTime();
		System.out.println(tea1);
		boolean unity1 = family.unity();
		System.out.println(unity1);
		double wakeUp1 = family.wakeUpTime();
		System.out.println(wakeUp1);
		System.out.println(family.equals(respect1));
		System.out.println(family.hashCode());
		System.out.println(family.toString());
		System.out.println(family.getClass());

	}

}
