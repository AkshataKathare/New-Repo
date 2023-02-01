package com.file.xworkz.boot;

import  com.file.xworkz.thing.FrenchFry;

public class FrenchFryRunner {

	public static void main(String[] args) {
		
		FrenchFry ref1=new FrenchFry("Crinkle-cut Fries");
		ref1.show();
		
		System.out.println("======================");
		
		FrenchFry ref2=new FrenchFry("Curly fries","KFC");
		ref2.show();
		
		System.out.println("======================");

		
		FrenchFry ref3=new FrenchFry(30);
		ref3.show();
		
		System.out.println("======================");

		
		FrenchFry ref4=new FrenchFry(3.5F);
		ref4.show();
		
		System.out.println("======================");

		
		FrenchFry ref5=new FrenchFry(25.5D,30.03D);
		ref5.show();
		
		System.out.println("======================");

		
		FrenchFry ref6=new FrenchFry(true);
		ref6.show();
		
		System.out.println("======================");

		
		FrenchFry ref7=new FrenchFry("Crunchy","fluffy",1.5F);
		ref7.show();
		
		System.out.println("======================");

		
		FrenchFry ref8=new FrenchFry("fluffy",2);
		ref8.show();
		
		System.out.println("======================");

		
		FrenchFry ref9=new FrenchFry("Peri-peri","Dominos",50);
		ref9.show();
		
		System.out.println("======================");

		
		FrenchFry ref10=new FrenchFry();
		ref10.show();

	}

}
