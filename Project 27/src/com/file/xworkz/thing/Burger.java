package com.file.xworkz.thing;

public class Burger {
	
	public String name;
	public String place;
	public int price;
	public String shop;
	public boolean goodForHealth;
	public String firstLayer;
	public String secondLayer;
	public String thirdLayer;
	public boolean cheeseUsed;
	public float carbohydrates;
	public float fats;
	public String bunColor;
	public boolean cooked;
	public String ingredient1;
	public String ingredient2;

	
	public Burger(String name,String place,int price,String shop,boolean goodForHealth,String firstLayer,String secondLayer,String thirdLayer,boolean cheeseUsed,float carbohydrates,float fats,String bunColor,boolean cooked,String ingredient1,String ingredient2) 
	{
		this.name=name;
		this.place=place;
		this.price=price;
		this.shop=shop;
		this.goodForHealth=goodForHealth;
		this.firstLayer=firstLayer;
		this.secondLayer=secondLayer;
		this.thirdLayer=thirdLayer;
		this.cheeseUsed=cheeseUsed;
		this.carbohydrates=carbohydrates;
		this.fats=fats;
		this.bunColor=bunColor;
		this.cooked=cooked;
		this.ingredient1=ingredient1;
		this.ingredient2=ingredient2;
	}
		public void show() {
			System.out.println(this.name);
			System.out.println(this.place);
			System.out.println(this.price);
			System.out.println(this.shop);
			System.out.println(this.goodForHealth);
			System.out.println(this.firstLayer);
			System.out.println(this.secondLayer);
			System.out.println(this.thirdLayer);
			System.out.println(this.cheeseUsed);
			System.out.println(this.carbohydrates);
			System.out.println(this.fats);
			System.out.println(this.bunColor);
			System.out.println(this.cooked);
			System.out.println(this.ingredient1);
			System.out.println(this.ingredient2);
			
		}
		
		
}

