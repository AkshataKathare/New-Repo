package com.file.xworkz.boot;

import com.file.xworkz.thing.Fan;

public class FanRunner {

	public static void main(String[] args) {
     
		Fan ref=new Fan();
		
		System.out.println(ref.color);
		System.out.println(ref.noOfBlades);
		System.out.println(ref.cost);
		
		ref.color="Brown";
		ref.noOfBlades=3;
		ref.cost=2000.00F;
		
		System.out.println(ref.color);
		System.out.println(ref.noOfBlades);
		System.out.println(ref.cost);
		
		
		
	}

}
