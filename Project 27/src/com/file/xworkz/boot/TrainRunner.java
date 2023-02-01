package com.file.xworkz.boot;

import  com.file.xworkz.thing.Train;

public class TrainRunner {

	public static void main(String[] args) {
		
		Train ref1=new Train("Dharwad");
		ref1.show();
		
		System.out.println("===============");
		
		Train ref2=new Train("Davangere","Siddhaganga");
		ref2.show();
		
		System.out.println("===============");
		
		Train ref3=new Train(70);
		ref3.show();
		
		System.out.println("===============");
		
		Train ref4=new Train(false);
		ref4.show();
		
		System.out.println("===============");
		
		Train ref5=new Train(10,true);
		ref5.show();
		
		System.out.println("===============");
		
		Train ref6=new Train(90);
		ref6.show();
		
		System.out.println("===============");
		
		Train ref7=new Train();
		ref7.show();
		
		

	}

}
