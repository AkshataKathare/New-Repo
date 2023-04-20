package com.xworkz.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Mall {

	public static void main(String[] args) {

		Map<Integer, String> malls = new HashMap<>();
		malls.put(1, "Lulu Mall");
		malls.put(2, "Orion");
		malls.put(3, "Forum");
		malls.put(4, "Vega City Mall");
		malls.put(5, "Gopalan Mall");
		malls.put(6, "Meenakshi Mall");
		malls.put(7, "Garuda Mall");
		malls.put(8, "Phoenix Mall");
		malls.put(9, "Mantri Mall");
		malls.put(10, "GT Mall");

		System.out.println(malls);

		String mall = malls.get(1);
		System.out.println(mall);

		malls.replace(7, "UB City Mall");
		System.out.println(malls);

		malls.remove(6);
		System.out.println(malls);
	}

}
