package com.xworkz.link.things;

public class Members implements FamilyRule {

	@Override
	public double wakeUpTime() {
		System.out.println("Running wakeUpTime in FamilyRule");
		return 8.01;
	}

	@Override
	public boolean sleepOnTime() {
		System.out.println("Running sleepAtTime in FamilyRule");
		return true;
	}

	@Override
	public String respectTo() {
		System.out.println("Running respectTo in FamilyRule");
		return "Elders";
	}

	@Override
	public String careFor() {
		return "Youngers";
	}

	@Override
	public boolean pray() {
		System.out.println("Running pray in FamilyRule");
		return true;
	}

	@Override
	public boolean beingIndependent() {
		System.out.println("Running beingIndependent in FamilyRule");
		return true;
	}

	@Override
	public int minMembers() {
		System.out.println("Running minMembers in FamilyRule");
		return 5;
	}

	@Override
	public double lunchTime() {
		System.out.println("Running lunchTime in FamilyRule");
		return 2;
	}

	@Override
	public double breakFastTime() {
		System.out.println("Running breakFastTime in FamilyRule");
		return 10.15;
	}

	@Override
	public boolean unity() {
		System.out.println("Running unity in FamilyRule");
		return true;
	}

	@Override
	public boolean attendFamilyFunctions() {
		System.out.println("Running attendFamilyFunctions in FamilyRule");
		return false;
	}

	@Override
	public boolean returnHomeOnTime() {
		System.out.println("Running returnHomeOnTime in FamilyRule");
		return false;
	}

	@Override
	public double limitTime() {
		System.out.println("Running limitTime in FamilyRule");
		return 7.25;
	}

	@Override
	public double teaTime() {
		System.out.println("Running teaTime in FamilyRule");
		return 5;
	}

	@Override
	public double snacksTime() {
		System.out.println("Running snacksTime in FamilyRule");
		return 7;
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Members");
		return "Wake up time:"+this.wakeUpTime()+this.breakFastTime()+this.careFor()+this.limitTime()+this.lunchTime()+this.minMembers()+this.respectTo()+this.snacksTime()+this.teaTime()+this.attendFamilyFunctions()+this.beingIndependent()+this.pray()+this.returnHomeOnTime()+this.sleepOnTime()+this.unity();
	}

}
