package com.xworkz.rule.implementation;

import com.xworkz.rule.things.ExamRule;

public class Examiner implements ExamRule {

	private double time;

	public Examiner() {
		System.out.println("No-arg constructor in Examiner");
	}

	@Override
	public String exam(double time) {
		this.time = time;
		if (time != 0 && time == 3) {
			System.out.println("Exam is of 3 hours");
			return "Board Exam";
		}
		System.out.println("Exam is not of 3 hours");
		return "FA exam";
	}

	@Override
	public boolean absent() {
		if (time == 3) {
			return false;
		} else {
			return true;
		}

	}

}
