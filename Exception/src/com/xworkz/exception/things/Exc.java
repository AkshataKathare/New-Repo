package com.xworkz.exception.things;

public class Exc {

	public static void main(String[] args) {
		
		try {
			int[] num= {1,2,3,4};
			System.out.println(num[6]);//ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException event) {
			System.out.println("Catch block of event ArrayIndexOutOfBoundsException");
			System.out.println(event.getMessage());
			System.out.println(event.getClass().getSimpleName());
		}
		System.out.println("After catch block of ArrayIndexOutOfBoundsException");

		try {
			throw new Exception();
		} catch (Exception event) {
			System.out.println("Catch block of event Exception..");
			System.out.println(event.getMessage());
			System.out.println(event.getClass().getSimpleName());
		}
		System.out.println("After catch block of Exception...");

	}
}
