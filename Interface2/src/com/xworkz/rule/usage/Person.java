package com.xworkz.rule.usage;

import com.xworkz.rule.things.Delivery;

public class Person {
	private Delivery delivery;

	public Person(Delivery delivery) {
		System.out.println("Const with Delivery");
		this.delivery = delivery;
	}

	public void check() {
		System.out.println("check method in Person");
		double charge = this.delivery.charges();
		double time = this.delivery.timeTaken();
		String name = this.delivery.agentName(3);

		if (charge <= 60) {
			System.out.println("Charges are ok :" + charge);
		}
		if (charge > 60) {
			System.out.println("Charges are expensive :" + charge);
		}
		if (time <= 30) {
			System.out.println("On time delivery :" + time);
		}
		if (time > 30) {
			System.out.println("Delayed delivery :" + time);
		}
		System.out.println(name);
	}

}
