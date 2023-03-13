package com.xworkz.rule.usage;

import com.xworkz.rule.things.ExamRule;

public class Institute {

	public ExamRule examRule;

	public Institute(ExamRule examRule) {
		System.out.println("Const with ExamRule");
		this.examRule = examRule;
	}

	public void checkExamRule() {
		String exam = this.examRule.exam(3);
		boolean absent = this.examRule.absent();

		if (exam.equals("Board Exam") && absent) {
			System.out.println("Exam is strict");
		}
		System.out.println("Exam is not strict");
	}

}
