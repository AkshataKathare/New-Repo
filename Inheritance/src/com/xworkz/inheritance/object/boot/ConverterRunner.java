package com.xworkz.inheritance.object.boot;

import com.xworkz.inheritance.object.things.Converter;
import com.xworkz.inheritance.object.things.Sport;
import com.xworkz.inheritance.object.things.TestCricket;

public class ConverterRunner {

	private static com.xworkz.inheritance.object.things.Sport sport;

	public static void main(String[] args) {

	
		Converter converter = new Converter();
		
		Sport sport=new Sport();
		
		converter.display1(sport);
		
		TestCricket cricket=new TestCricket();
		
		converter.display1(cricket);
	}

}
