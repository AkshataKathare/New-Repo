package com.file.xworkz.thing;

public class Umbrella {
	public String color;
	public float length;
	public int fold;
	public double cost;
	public String shopName;
	public String usedIn;
	public String handleShape;
	public boolean lightWeight;
	public String material;
	public boolean goodQuality;
	
	public Umbrella(String color,float length,int fold,double cost,String shopName,String usedIn,String handleShape,boolean lightWeight,String material,boolean goodQuality)
	{
		this.color=color;
		this.length=length;
		this.fold=fold;
		this.cost=cost;
		this.shopName=shopName;
		this.usedIn=usedIn;
		this.handleShape=handleShape;
		this.lightWeight=lightWeight;
		this.material=material;
		this.goodQuality=goodQuality;
	}
	
	public void show() {
		System.out.println(this.color);
		System.out.println(this.length);
		System.out.println(this.fold);
		System.out.println(this.cost);
		System.out.println(this.shopName);
		System.out.println(this.usedIn);
		System.out.println(this.handleShape);
		System.out.println(this.lightWeight);
		System.out.println(this.material);
		System.out.println(this.goodQuality);
	}

}
