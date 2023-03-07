package com.xworkz.exception.boot;

import com.xworkz.exception.things.ExceptionEvent;
import com.xworkz.exception.things.RuntimeExceptionEvent;

public class ExceptionRunner {

	public static void main(String[] args) {
		try {
			// throw new RuntimeExceptionEvent();// implicitly creating the custom runtime
			// or custom unchecked exception
			RuntimeExceptionEvent runtime = new RuntimeExceptionEvent();// explicitly creating the event
			throw runtime;
		} catch (RuntimeExceptionEvent runtimeException) {
			System.out.println("catch block of RuntimeExceptionEvent..");
		}
		try {
			throw new ExceptionEvent();// implicitly creating the custom compiletime/checked exception
		} catch (ExceptionEvent event) {
			System.out.println("catch block of ExceptionEvent..");
			event.printStackTrace();
		}

		try {
			int[] num = { 1, 2, 3, 4 };
			System.out.println(num[6]);// ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException event) {
			System.out.println("Catch block of event ArrayIndexOutOfBoundsException");
			System.out.println(event.getMessage());
			System.out.println(event.getClass().getSimpleName());
			event.printStackTrace();
		}
		System.out.println("After catch block of ArrayIndexOutOfBoundsException");

		try {
			throw new Exception();
		} catch (Exception event) {
			System.out.println("Catch block of event Exception..");
			System.out.println(event.getMessage());
			System.out.println(event.getClass().getSimpleName());
			event.printStackTrace();
		}
		System.out.println("After catch block of Exception...");
	}

}
