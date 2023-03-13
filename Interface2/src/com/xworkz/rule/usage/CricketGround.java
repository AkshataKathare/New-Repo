package com.xworkz.rule.usage;

import com.xworkz.rule.things.CricketRule;

public class CricketGround {

	public CricketRule cricketRule;

	public CricketGround(CricketRule cricketRule) {
		System.out.println("Balling const with CricketRule..");
		this.cricketRule = cricketRule;
	}

	public void checkCricketRule() {
		boolean goodCoach = this.cricketRule.goodCoach();
		int players = this.cricketRule.noOfPlayers();

		if (players == CricketRule.TOTALPLAYERS && goodCoach) {
			System.out.println("Cricket team wins");
		} else {
			System.out.println("Cricket team may loose");
		}
	}

}
