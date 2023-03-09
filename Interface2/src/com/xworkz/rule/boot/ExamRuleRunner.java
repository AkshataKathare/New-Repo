package com.xworkz.rule.boot;

import com.xworkz.rule.implementation.Examiner;
import com.xworkz.rule.things.ExamRule;
import com.xworkz.rule.things.Institute;

public class ExamRuleRunner {

	public static void main(String[] args) {

		ExamRule examRule = new Examiner();

		Institute institute = new Institute(examRule);
		institute.checkExamRule();
	}
}
