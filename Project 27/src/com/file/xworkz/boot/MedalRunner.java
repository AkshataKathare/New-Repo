package com.file.xworkz.boot;

import com.file.xworkz.thing.Medal;

public class MedalRunner {

	public static void main(String[] args) {
		
		Medal ref1=new Medal();
		
		ref1.name="Arjuna Award";
		ref1.type="Gold";
		ref1.competitionName="Chess";
		ref1.cashPrize=2000;
		ref1.firstPrize=true;
		ref1.level="State level";
		ref1.place="Delhi";
		ref1.ribbonLength=3;
		ref1.diameter=2;
		ref1.ribbonColour="Red";
		ref1.coachName="Daniel";
		ref1.rank=1;
		ref1.goldCoated=true;
		ref1.createdBy="Antonio Pisano";
		
		ref1.display();
		
		System.out.println("===============");
		
		Medal ref2=new Medal();
		ref2.name="Sports Award";
		ref2.type="Silver";
		ref2.competitionName="Basket Ball";
		ref2.cashPrize=1000;
		ref2.firstPrize=false;
		ref2.level="District level";
		ref2.place="Dharwad";
		ref2.ribbonLength=2;
		ref2.diameter=3;
		ref2.ribbonColour="Yellow";
		ref2.coachName="Louis";
		ref2.rank=2;
		ref2.goldCoated=false;
		ref2.createdBy="Antonio Pisano";
	
		ref2.display();
	
	}

}
