package com.xworkz.override.equalsRunner;

import com.xworkz.override.equals.Fish;

public class FishRunner {

	public static void main(String[] args) {

		Fish fish1 = new Fish("Bangda", "Grey", 15, 5, false);
		System.out.println(fish1);

		Fish fish2 = new Fish("Bangda", "Grey", 15, 5, false);
		System.out.println(fish2);

		boolean same = fish1.equals(fish2);
		System.out.println(same);

		System.out.println("");

		Fish fish3 = new Fish("Pomplet", "Grey", 28, 5, true);
		System.out.println(fish3);

		boolean equal = fish1.equals(fish3);
		System.out.println(equal);

	}

}
