package com.xworkz.inheritance.object.things;

import com.xworkz.inheritance.object.things.Cricket;
import com.xworkz.inheritance.object.things.ODICricket;
import com.xworkz.inheritance.object.things.Sport;
import com.xworkz.inheritance.object.things.T20Cricket;
import com.xworkz.inheritance.object.things.TestCricket;

public class Converter {

	public void display1(Sport sport) {

		if(sport instanceof Sport) {
			Sport sport1=new Sport();
			System.out.println(sport1.getTotal());	
		}
		
		
		}
}
