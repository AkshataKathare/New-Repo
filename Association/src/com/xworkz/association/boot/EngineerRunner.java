package com.xworkz.association.boot;

import com.xworkz.association.things.Degree;
import com.xworkz.association.things.Engineer;

public class EngineerRunner {

	public static void main(String[] args) {
		Engineer engineer = new Engineer();

		engineer.setName("Akshata");
		engineer.setSalary(20000);

		String[] ref1 = { "Core Java", "SQL", "WebTechnology" };
		engineer.setSkills(ref1);

		Degree degree = new Degree();
		degree.setName("BSc");
		degree.setDuration(3);
		degree.setPursue(false);
		degree.setPercentage(90);
		degree.setBranch("PCM");

		Degree degree1 = new Degree();
		degree1.setName("Shubhangi");
		degree1.setDuration(4);
		degree1.setPursue(true);
		degree1.setPercentage(85);
		degree1.setBranch("EC");

		Degree[] ref = { degree, degree1};
		engineer.setDegrees(ref);

		engineer.display();
	}

}
