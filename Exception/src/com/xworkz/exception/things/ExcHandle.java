package com.xworkz.exception.things;

public class ExcHandle {

	public void stack1() throws Exception {
		System.out.println("stack1 in ExcHandle");
		this.stack2();
	}

	public void stack2() throws Exception {
		System.out.println("stack2 in Exchandle");
		this.stack3();
	}

	public void stack3() throws Exception {
		System.out.println("stack3 in ExcHandle");
		this.stack4();
	}

	public void stack4() throws Exception {
		System.out.println("stack4 in Exchandle");
		try {
			System.out.println("Start in try block");
			this.stack5();
			System.out.println("End in try block..");
		} catch (Exception exception) {
			System.out.println("Beginning in catch..");
		}
		System.out.println("End in catch..");
	}

	public void stack5() throws Exception {
		System.out.println("stack5 in ExcHandle");
		Exception exception = new Exception();
		throw exception;
	}
	

}
