package com.xworkz.rule.implementation;

import com.xworkz.rule.things.Internet;
import com.xworkz.rule.things.Modem;

public class InterImpl implements Internet, Modem {

	@Override
	public double speed(String plan) {
		return 300;
	}

}
