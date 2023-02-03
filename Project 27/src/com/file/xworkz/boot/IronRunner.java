package com.file.xworkz.boot;

import com.file.xworkz.thing.Iron;

public class IronRunner {

	public static void main(String[] args) {
		Iron iron = new Iron(true, "Tata");
		iron.display();

		System.out.println("====================");

		Iron iron1 = new Iron("Rod shape", 20);
		iron1.display();

		System.out.println("====================");

		Iron iron2 = new Iron(6, "Pillar", 3);
		iron2.display();

		System.out.println("====================");

		Iron iron3 = new Iron(7, "Chair", 4, true, "Ashok", 100);
		iron3.display();

		System.out.println("====================");

		Iron iron4 = new Iron();
		iron4.initVar(false, "JVS", "Circle", 4, 35, "Designing", 3, true, "Sangmesh", 400);
		iron4.display();

	}

}
