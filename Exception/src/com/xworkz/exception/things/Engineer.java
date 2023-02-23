package com.xworkz.exception.things;

public class Engineer extends Person {

	public Engineer(int id, String name, int age, String email) {
		super(id, name, age, email);
	}

	public Engineer(int id, String name, String email) {
		super(id, name, email);
	}

	public Engineer(int id, String name) {
		super(id, name);
	}

	@Override
	public String toString() {
		System.out.println("Over-riding toString in Person..");
		return "ID :" + this.id + " Name :" + this.name + " Age :" + this.age + " Email :" + this.email;
	}

	@Override
	public int hashCode() {
		System.out.println("Over-riding hashCode in Engineer..");
		return 100;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Over-riding equals in Engineer..");
		if (obj != null) {
			System.out.println("obj is not null..");
			if (obj instanceof Engineer) {
				System.out.println("obj is Engineer type");
				Engineer casted = (Engineer) obj;
				Engineer left = this;
				Engineer right = casted;
				if (left.id == right.id && left.name.equals(right.name) && left.age == right.age
						&& left.email.equals(right.email)) {
					System.out.println("left and right are same");
					return true;
				} else {
					System.err.println("left and right are not same");
				}
			} else {
				System.err.println("obj is not Engineer type..");
			}
		} else {
			System.err.println("obj is null..");
		}
		return super.equals(obj);
	}

}
