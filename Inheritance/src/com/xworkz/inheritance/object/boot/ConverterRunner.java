package com.xworkz.inheritance.object.boot;

import com.xworkz.inheritance.object.things.Converter;
import com.xworkz.inheritance.things.Sport;

public class ConverterRunner {

	public static void main(String[] args) {

		Converter converter = new Converter();
		
		Sport sport=new Sport();
		converter.display1(sport);
		converter.display2();
		converter.display3();
		converter.display4();
		converter.display5();

	}

}
