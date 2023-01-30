package com.file.xworkz.boot;

import com.file.xworkz.thing.Zebra;

public class ZebraRunner {

	public static void main(String[] args) {

		Zebra zebra=new Zebra();
		
		System.out.println(zebra.color);
		System.out.println(zebra.wildAnimal);
		System.out.println(zebra.lifeSpan);
		
		zebra.color="Black and white";
		zebra.wildAnimal=true;
		zebra.lifeSpan=25;
		
		System.out.println(zebra.color);
		System.out.println(zebra.wildAnimal);
		System.out.println(zebra.lifeSpan);
		
		
	}

}
