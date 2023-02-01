package com.file.xworkz.boot;

import  com.file.xworkz.thing.Image;

public class ImagRunner {

	public static void main(String[] args) {
		Image ref1=new Image("Nature");
		ref1.show();
		
		System.out.println("=====================");
		
		Image ref2=new Image(3);
		ref2.show();
		
		System.out.println("=====================");
		
		Image ref3=new Image(true);
		ref3.show();
		
		System.out.println("=====================");
		
		Image ref4=new Image('A');
		ref4.show();
		
		System.out.println("=====================");
		
		Image ref5=new Image("White","POCO");
		ref5.show();
		
		System.out.println("=====================");
		
		Image ref6=new Image("Black","MI","Akshata");
		ref6.show();
		
		System.out.println("=====================");
		
		Image ref7=new Image(true,48);
		ref7.show();
		
		System.out.println("=====================");		

		
		Image ref8=new Image();
		ref8.show();
		
		

	}

}
