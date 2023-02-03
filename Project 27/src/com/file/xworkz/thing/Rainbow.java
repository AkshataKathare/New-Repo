package com.file.xworkz.thing;

public class Rainbow {
	public String observedIn;
	public int noOfColors;
	public String dueTo;
	public String type;
	public String symbolOf;
	public boolean attractive;
	public String favColor;
	
	public Rainbow(String observedIn,int noOfColors,String dueTo,String type,String symbolOf,boolean attractive,String favColor)
	{
		this.observedIn=observedIn;
		this.noOfColors=noOfColors;
		this.dueTo=dueTo;
		this.type=type;
		this.symbolOf=symbolOf;
		this.attractive=attractive;
		this.favColor=favColor;
		
	}
	
	public void show() {
		System.out.println(this.observedIn);
		System.out.println(this.noOfColors);
		System.out.println(this.dueTo);
		System.out.println(this.type);
		System.out.println(this.symbolOf);
		System.out.println(this.attractive);
		System.out.println(this.favColor);
	}

}
