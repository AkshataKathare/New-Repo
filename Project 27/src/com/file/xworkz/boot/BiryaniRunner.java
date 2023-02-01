package com.file.xworkz.boot;

import com.file.xworkz.thing.Biryani;

public class BiryaniRunner {

	public static void main(String[] args) {
		Biryani ref1=new Biryani("Chicken biryani");
		ref1.show();
		
		System.out.println("===========================");
		
		Biryani ref2=new Biryani("Mutton Biryani","Albek");
		ref2.show();
		
		System.out.println("===========================");

		
		Biryani ref3=new Biryani(200);
		ref3.show();
		
		System.out.println("===========================");

		
		Biryani ref4=new Biryani(true);
		ref4.show();

		System.out.println("===========================");

		
		Biryani ref5=new Biryani(2);
		ref5.show();
		
		System.out.println("===========================");

		
		Biryani ref6=new Biryani(3,4);
		ref6.show();
		
		System.out.println("===========================");

		
		Biryani ref7=new Biryani(30);
		ref7.show();
		
		System.out.println("===========================");

		
		Biryani ref8=new Biryani(10,20);
		ref8.show();
		
		System.out.println("===========================");

		
		Biryani ref9=new Biryani(true,false);
		ref9.show();
		
		System.out.println("===========================");

		
		Biryani ref10=new Biryani("Rice","Chicken","Chilli","Coriander");
		ref10.show();
		
		System.out.println("===========================");

		
		Biryani ref11=new Biryani();
		ref11.show();
		
		

	}

}
