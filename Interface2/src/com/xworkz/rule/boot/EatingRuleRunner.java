package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Customer;
import com.xworkz.rule.things.EatingRule;
import com.xworkz.rule.things.Hotel;

public class EatingRuleRunner {

	public static void main(String[] args) {

		// create the interface
		// create the impl
		// create the usage class
		// associate interface with usage class

		EatingRule eatingRule = new Customer();

		Hotel hotel = new Hotel(eatingRule);
		hotel.checkEatingRule();

	}

}
