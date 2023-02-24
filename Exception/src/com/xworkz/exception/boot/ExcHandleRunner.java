package com.xworkz.exception.boot;

import com.xworkz.exception.things.ExcHandle;

public class ExcHandleRunner {

	public static void main(String[] args) throws Exception {

		System.out.println("Start in ExcHandleRunner..");

		ExcHandle exc = new ExcHandle();
		System.out.println("Try with catch..");
		exc.stack1();

		System.out.println("End in ExcHandleRunner...");
		/*
		 * try { System.out.println("Start in try block"); 
		 * this.stack5();
		 * System.out.println("End in try block.."); 
		 * } catch (Exception exception) {
		 * System.out.println("Beginning in catch..");
		 *  }
		 * System.out.println("End in catch..");
		 */
	}

}
