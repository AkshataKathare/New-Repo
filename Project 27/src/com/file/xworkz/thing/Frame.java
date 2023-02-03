package com.file.xworkz.thing;

public class Frame {
	public String name;
	public int cost;
	public float size;
	public String photoOf;
	public String photographer;
	public String background;
	public boolean flowerBorder;
	public boolean colored;
	public String shopName;
	public String place;
	public String material;
	public boolean glass;
	

	
	public Frame(String name,int cost,float size,String photoOf,String photographer,String background,boolean flowerBorder,boolean colored,String shopName,String place,String material,boolean glass)
	{
		this.name=name;
		this.cost=cost;
		this.size=size;
		this.photoOf=photoOf;
		this.photographer=photographer;
		this.background=background;
		this.flowerBorder=flowerBorder;
		this.colored=colored;
		this.shopName=shopName;
		this.place=place;
		this.material=material;
		this.glass=glass;
		
	}
	
	public void display() {
		System.out.println(this.name);
		System.out.println(this.cost);
		System.out.println(this.size);
		System.out.println(this.photoOf);
		System.out.println(this.photographer);
		System.out.println(this.background);
		System.out.println(this.flowerBorder);
		System.out.println(this.colored);
		System.out.println(this.shopName);
		System.out.println(this.place);
		System.out.println(this.material);
		System.out.println(this.glass);
	}

}