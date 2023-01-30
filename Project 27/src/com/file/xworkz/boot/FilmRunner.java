package com.file.xworkz.boot;

import com.file.xworkz.thing.Film;

public class FilmRunner {

	public static void main(String[] args) {
		
		Film film=new Film();
		System.out.println(film.name);
		System.out.println(film.budget);
		System.out.println(film.released);
		System.out.println(film.hero);
		System.out.println(film.heroine);
		
		film.name="Yeh jawaani hai deewani";
		film.budget=2000000;
		film.released=true;
		film.hero="Ranbir Kapoor";
		film.heroine="Deepika Padukone";
		
		System.out.println(film.name);
		System.out.println(film.budget);
		System.out.println(film.released);
		System.out.println(film.hero);
		System.out.println(film.heroine);
		
		
		
	

	}

}
