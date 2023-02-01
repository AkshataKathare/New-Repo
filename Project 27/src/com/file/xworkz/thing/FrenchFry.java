package com.file.xworkz.thing;

public class FrenchFry {

	public String type;
	public String hotel;
	public int price;
	public float length;
	public double carbohydrates;
	public double proteins;
	public boolean good;
	public String exterior;
	public String interior;
	public float width;
	
	public FrenchFry(String arg1) {
		type=arg1;
	}
	public FrenchFry(String arg1,String arg2) {
		type=arg1;
		hotel=arg2;
	}
	public FrenchFry(int arg3) {
		price=arg3;
	}
	public FrenchFry(float arg4) {
		length=arg4;
	}
	public FrenchFry(double arg5,double arg6) {
		carbohydrates=arg5;
		proteins=arg6;
	}
	public FrenchFry(boolean arg7) {
		good=arg7;
	}
	public FrenchFry(String arg8,String arg9,float arg10) {
		exterior=arg8;
		interior=arg9;
		width=arg10;
	}
	public FrenchFry(String arg11,float arg12) {
		interior=arg11;
		width=arg12;
	}
	public FrenchFry(String arg13,String arg14,int arg16) {
		type=arg13;
		hotel=arg14;
		price=arg16;
	}
	public FrenchFry() {
		System.out.println("No-arg or default constructor");
	}
	
	public void show() {
		System.out.println("Type of French fry :"+type);
		System.out.println("Hotel :"+hotel);
		System.out.println("Price :"+price);
		System.out.println("Length :"+length);
		System.out.println("Carbohydrates :"+carbohydrates);
		System.out.println("Proteins :"+proteins);
		System.out.println("Good :"+good);
		System.out.println("Exterior :"+exterior);
		System.out.println("Interior :"+interior);
		System.out.println("Width :"+width);

	}
}
