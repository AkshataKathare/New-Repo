package com.xworkz.exception.things;

public class Event {

	Throwable throwable = new Throwable();

	public void Throwable() throws Throwable {
		System.out.println("Creating Throwable");
		throw throwable;
	}

	Exception exception = new Exception();

	public void Exception() throws Exception {
		System.out.println("Creating event Exception");
		throw exception;
	}

	Error error = new Error();

	public void Error() {
		System.out.println("Creating event Error");
		throw error;
	}

	RuntimeException runtimeException = new RuntimeException();

	public void RuntimeException() {
		System.out.println("Creating event Runtimeexception");
		throw runtimeException;
	}

}
