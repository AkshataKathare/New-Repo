package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class ProductDetail {

	public static void main(String[] args) {

		Map<String, Double> products = new HashMap<>();

		System.out.println("Insertion");
		products.put("Soap", 20d);
		products.put("Tooth paste", 30.50d);
		products.put("Mobile", 20000d);
		products.put("Bucket", 378d);
		products.put("Water Bottle", 150.99d);
		products.put("Laptop", 35000d);
		products.put("Purse", 500d);
		products.put("Pen", 10d);
		products.put("Purse", 600d);
		products.put("Shoes", 1000d);
		products.put(null, 209d);
		products.put(null, 209d);
		products.put("Earphone", 209d);

		System.out.println(products);

		System.out.println("Reading");
		Double price = products.get("Soap");
		System.out.println("Soap price :" + price);

		System.out.println("Updating");
		products.replace("Mobile", 20390d);
		System.out.println(products);

		System.out.println("Deletion");

		products.remove("Shoes");
		System.out.println(products);

		products.clear();
		System.out.println(products);
	}

}
