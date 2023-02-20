package com.xworkz.inheritance.hashCode.boot;

import com.xworkz.inheritance.hashCode.things.Paint;

public class PaintRunner {

	public static void main(String[] args) {

		Paint paint1 = new Paint();
		paint1.setBrand("Asian paints");
		paint1.setPrice(200);
		paint1.setShop("Akshata");
		paint1.setPink(true);
		System.out.println(paint1);
		System.out.println(paint1.hashCode() + ", Original hashcode :" + System.identityHashCode(paint1));

		System.out.println("       ");

		Paint paint2 = new Paint();
		paint2.setBrand("bajaj");
		paint2.setPrice(500);
		paint2.setShop("Arpita");
		paint2.setPink(false);
		System.out.println(paint2);
		System.out.println(paint2.hashCode() + ", Original hashcode :" + System.identityHashCode(paint2));

		System.out.println("       ");

		boolean equal = paint1.equals(paint2);
		System.out.println("paint1 and paint2 are same :"+equal);
	}

}
