package com.xworkz.link.boot;

public class Programmer implements CodingRule {

	@Override
	public String className() {
		System.out.println("Running className in Programmer");
		return "CamelCase";
	}

	@Override
	public String methodName() {
		System.out.println("Running methodName in Programmer");
		return "camelCase";
	}

	@Override
	public String finalVar() {
		System.out.println("Running finalVar in Programmer");
		return "UPPERCASE";
	}

	@Override
	public int primitiveDataTypes() {
		System.out.println("Running primitiveDataTypes in Programmer");
		return 8;
	}

	@Override
	public String nonPrimitiveDataTypes() {
		System.out.println("Running nonPrimitiveDataTypes in Programmer");
		return "Infinity";
	}

	@Override
	public String principle1() {
		System.out.println("Running principle1 in Programmer");
		return "Polymorphism";
	}

	@Override
	public String principle2() {
		System.out.println("Running principle2 in Programmer");
		return "Inheritance";
	}

	@Override
	public String principle3() {
		System.out.println("Running principle3 in Programmer");
		return "Abstraction";
	}

	@Override
	public String principle4() {
		System.out.println("Running principle4 in Programmer");
		return "Encapsulation";
	}

	@Override
	public String accessabilityOfStaticMembers() {
		System.out.println("Running accessabilityOfStaticMembers in Programmer");
		return "ref or ClassName";
	}

	@Override
	public String toString() {
		return this.accessabilityOfStaticMembers() + this.className() + this.finalVar() + this.methodName()
				+ this.nonPrimitiveDataTypes() + this.primitiveDataTypes() + this.principle1() + this.principle2()
				+ this.principle3() + this.principle4();
	}

}
