package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.Pipe;

public class PipeRunner {

	public static void main(String[] args) {

		Pipe pipe1 = new Pipe();
		pipe1.setColor("White");
		pipe1.setCompany("Finolex");
		pipe1.setCost(300);
		pipe1.setLength(7);
		System.out.println(pipe1);
		System.out.println(pipe1.hashCode() + "Original hashCode of pipe1 :" + System.identityHashCode(pipe1));

		System.out.println("      ");

		Pipe pipe2 = new Pipe();
		pipe2.setColor("Grey");
		pipe2.setCompany("Ashirwad");
		pipe2.setCost(400);
		pipe2.setLength(25);
		System.out.println(pipe2);
		System.out.println(pipe2.hashCode() + "Original hashCode of pipe2 :" + System.identityHashCode(pipe2));

		System.out.println("      ");
		
		boolean equal = pipe1.equals(pipe2);
		System.out.println(equal);
	}

}
