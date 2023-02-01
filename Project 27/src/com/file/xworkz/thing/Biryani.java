package com.file.xworkz.thing;

public class Biryani {
	
	public String name;
	public String hotel;
	public int price;
	public boolean tasty;
	public float quantity;
	public float chickenQuantity;
	public double carbohydrates;
	public double protein;
	public double fats;
	public boolean detoxifier;
	public boolean costly;
	public String ingredient1;
	public String ingredient2;
	public String ingredient3;
	public String ingredient4;
	
	public Biryani(String arg1) {
		name=arg1;
	}
	public Biryani(String arg2,String arg3) {
		name=arg2;
		hotel=arg3;
	}
	public Biryani(int arg4) {
		price=arg4;
	}
	public Biryani(boolean arg5){
		tasty=arg5;
    }
	public Biryani(float arg6) {
		quantity=arg6;
	}
	public Biryani(float arg7,float arg8) {
		quantity=arg7;
		chickenQuantity=arg8;
	}
	public Biryani(double arg9) {
		carbohydrates=arg9;
	}
	public Biryani(double arg10,double arg11) {
		protein=arg10;
		fats=arg11;
	}
	public Biryani(boolean arg12,boolean arg13) {
		detoxifier=arg12;
		costly=arg13;
	}
	public Biryani(String arg14,String arg15,String arg16,String arg17) {
		ingredient1=arg14;
		ingredient2=arg15;
		ingredient3=arg16;
		ingredient4=arg17;
		
	}
	public Biryani() {
		System.out.println("No-arg constructor");
	}
	
	public void show() {
		System.out.println("Name of Biryani :"+name);
		System.out.println("Name of Hotel :"+hotel);
		System.out.println("Price of Biryani :"+price);
		System.out.println("Tasty :"+tasty);
		System.out.println("Quantity of Biryani :"+quantity);
		System.out.println("Quantity of Chicken :"+chickenQuantity);
		System.out.println("Carbohydrates :"+carbohydrates);
		System.out.println("Protein :"+protein);
		System.out.println("Fats :"+fats);
		System.out.println("Detoxifier :"+detoxifier);		
		System.out.println("Costly :"+costly);
		System.out.println("Ingredient :"+ingredient1);
		System.out.println("Ingredient :"+ingredient2);
		System.out.println("Ingredient :"+ingredient3);
		System.out.println("Ingredient :"+ingredient4);
		
		
	}
	

}
