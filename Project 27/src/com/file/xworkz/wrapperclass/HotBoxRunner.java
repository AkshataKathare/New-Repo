package com.file.xworkz.wrapperclass;

public class HotBoxRunner {

	public static void main(String[] args) {
		HotBox hotBox = new HotBox();
		hotBox.radius = 2;
		hotBox.diameter = 4;
		hotBox.cost = 300;
		hotBox.scannerCode = 458394L;
		hotBox.capacity = 30;
		hotBox.weight = 15;
		hotBox.quality = 'A';
		hotBox.steel = true;

		System.out.println("AutoBoxing");

		Byte b = hotBox.radius;
		System.out.println("Radius :" + b);

		Short s = hotBox.diameter;
		System.out.println("Diameter :" + s);

		Integer i = hotBox.cost;
		System.out.println("Cost :" + i);

		Long l = hotBox.scannerCode;
		System.out.println("Scanner code :" + l);

		Float f = hotBox.capacity;
		System.out.println("Capacity :" + f);

		Double d = hotBox.weight;
		System.out.println("Weight :" + d);

		Character c = hotBox.quality;
		System.out.println("Quality :" + c);

		Boolean o = hotBox.steel;
		System.out.println("Steel :" + o);

		System.out.println("    ");

		System.out.println("Auto Unboxing");

		byte y = new Byte(b);
		System.out.println("Unbox Radius :" + y);

		short h = new Short(s);
		System.out.println("Unbox Diameter :" + h);

		int n = new Integer(i);
		System.out.println("Unbox cost :" + n);

		long g = new Long(l);
		System.out.println("Unbox scanner code :" + g);

		float t = new Float(f);
		System.out.println("Unbox Capacity :" + t);

		double e = new Double(d);
		System.out.println("Unbox weight :" + e);

		boolean q = new Boolean(o);
		System.out.println("Unbox steel :" + q);

	}

}
