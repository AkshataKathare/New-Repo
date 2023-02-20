package com.xworkz.inheritance.object.things;

import com.xworkz.inheritance.object.things.Cricket;
import com.xworkz.inheritance.object.things.ODICricket;
import com.xworkz.inheritance.object.things.Sport;
import com.xworkz.inheritance.object.things.T20Cricket;
import com.xworkz.inheritance.object.things.TestCricket;

public class Converter {

	public void display1(Sport sport) {

		if (sport instanceof TestCricket) {
			TestCricket cricket = (TestCricket) sport;
			cricket.getCaptainName();
		}

		System.out.println(sport.getTotal());
	}

	public void display2(Sport cricket) {
		Sport sport1 = new Cricket();
		System.out.println(sport1.getTotal());
		Cricket cricket1 = (Cricket) sport1;
		System.out.println(cricket1.getCountry());
		System.out.println(cricket1.getCoachName());
	}

	public void display3() {
		Sport sport2 = new TestCricket();
		System.out.println(sport2.getTotal());
		Cricket cricket2 = (Cricket) sport2;
		System.out.println(cricket2.getCountry());
		System.out.println(cricket2.getCoachName());
		TestCricket test1 = (TestCricket) sport2;
		System.out.println(test1.getCaptainName());
	}

	public void display4() {
		Sport sport3 = new ODICricket();
		System.out.println(sport3.getTotal());
		Cricket cricket3 = (Cricket) sport3;
		System.out.println(cricket3.getCountry());
		System.out.println(cricket3.getCoachName());
		ODICricket oDI = (ODICricket) sport3;
		System.out.println(oDI.getGroundName());
	}

	public void display5() {
		Sport sport4 = new T20Cricket();
		System.out.println(sport4.getTotal());
		Cricket cricket4 = (Cricket) sport4;
		System.out.println(cricket4.getCountry());
		System.out.println(cricket4.getCoachName());
		ODICricket oDI2 = (ODICricket) sport4;
		System.out.println(oDI2.getGroundName());
		T20Cricket t20 = (T20Cricket) sport4;
		System.out.println(t20.getSponsorName());
	}

}
