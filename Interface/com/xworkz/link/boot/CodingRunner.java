package com.xworkz.link.boot;

public class CodingRunner {

	public static void main(String[] args) {

		
		Programmer programmer = new Programmer();
		System.out.println(programmer.accessabilityOfStaticMembers());
		System.out.println(programmer.className());
		System.out.println(programmer.finalVar());
		System.out.println(programmer.methodName());
		System.out.println(programmer.nonPrimitiveDataTypes());
		System.out.println(programmer.primitiveDataTypes());
		System.out.println(programmer.principle1());
		System.out.println(programmer.principle2());
		System.out.println(programmer.principle3());
		System.out.println(programmer.principle4());
		System.out.println(programmer.equals(programmer));
		System.out.println(programmer.hashCode());
		System.out.println(programmer.toString());
		System.out.println(programmer.getClass());

		CodingRule coding = new Programmer();
		System.out.println(coding.accessabilityOfStaticMembers());
		System.out.println(coding.className());
		System.out.println(coding.finalVar());
		System.out.println(coding.methodName());
		System.out.println(coding.nonPrimitiveDataTypes());
		System.out.println(coding.primitiveDataTypes());
		System.out.println(coding.principle1());
		System.out.println(coding.principle2());
		System.out.println(coding.principle3());
		System.out.println(coding.principle4());
		System.out.println(coding.equals(coding));
		System.out.println(coding.hashCode());
		System.out.println(coding.toString());
		System.out.println(coding.getClass());
	}

}
