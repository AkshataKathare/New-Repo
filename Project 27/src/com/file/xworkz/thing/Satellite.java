package com.file.xworkz.thing;

public class Satellite {
	
	public String name;
	public String institute;
	public String fuel;
	public float budget;
	public int launchDate;
	public String launchMonth;
	public int year;
	public int length;
	public int width;
	public float diameter;
	public double weight;
	public boolean indian;
	public int noOfSatellites;
	public boolean camera;
	public String orbit;
	public boolean solarPanel;
	
	public void display() {
		System.out.println("Name of satellite :"+name);
		System.out.println("Name of institute :"+institute);
		System.out.println("Fuel used :"+fuel);
		System.out.println("Budget :"+budget);
		System.out.println("Date of launch :"+launchDate);
		System.out.println("Month launch  :"+launchMonth);
		System.out.println("Year of launch "+year);
		System.out.println("Length of satellite :"+length);
		System.out.println("Width of satellite :"+width);
		System.out.println("Diameter :"+diameter);
		System.out.println("Weigth :"+weight);
		System.out.println("Indian :"+indian);
		System.out.println("Number of satellites :"+noOfSatellites);
		System.out.println("Camera present :"+camera);
		System.out.println("Shape of orbit :"+orbit);
		System.out.println("Solar panel :"+solarPanel);
		
	}
	
	
	

}
