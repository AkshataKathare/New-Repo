package com.xworkz.inheritance.object.things;

public class Converter {

	public void display1(Sport sport) {
		if (sport instanceof Sport) {
			System.out.println(sport.getTotal());
		}
		if (sport instanceof Cricket) {
			System.out.println(sport.getTotal());
			Cricket cricket = (Cricket) sport;
			System.out.println(cricket.getCoachName());
			System.out.println(cricket.getCountry());
		}
		if (sport instanceof TestCricket) {
			System.out.println(sport.getTotal());
			TestCricket testCricket = (TestCricket) sport;
			System.out.println(testCricket.getCaptainName());
			System.out.println(testCricket.getCoachName());
			System.out.println(testCricket.getCountry());
		}
		if (sport instanceof ODICricket) {
			System.out.println(sport.getTotal());
			ODICricket odiCricket = (ODICricket) sport;
			System.out.println(odiCricket.getGroundName());
			System.out.println(odiCricket.getCoachName());
			System.out.println(odiCricket.getCountry());
		}
		if (sport instanceof T20Cricket) {
			System.out.println(sport.getTotal());
			T20Cricket t20Cricket = (T20Cricket) sport;
			System.out.println(t20Cricket.getSponsorName());
			System.out.println(t20Cricket.getGroundName());
			System.out.println(t20Cricket.getCountry());
			System.out.println(t20Cricket.getCoachName());

		}

	}
}
