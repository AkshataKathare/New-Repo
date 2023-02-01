package com.file.xworkz.thing;

public class Train {
	
	public String from;
	public String to;
	public String trainName;
	public int  ticketPrice;
	public boolean blue;
	public int noOfCompartments;
	public boolean comfortable;
	public double distance;
	
	public Train(String arg1) {
		from=arg1;
	}
	public Train(String arg2,String arg3) {
		to=arg2;
		trainName=arg3;
	}
	public Train(int arg4) {
		ticketPrice=arg4;
	}
	public Train(boolean arg5) {
		blue=arg5;
	}	
	public Train(int arg6,boolean arg7) {
		noOfCompartments=arg6;
		comfortable=arg7;
	}
	public Train(double arg8) {
		distance=arg8;
	}
	public Train() {
		System.out.println("No-arg constructor");
	}
	
	public void show() {
		System.out.println("From :"+from);
		System.out.println("To :"+to);
		System.out.println("Name of train :"+trainName);
		System.out.println("Ticket price :"+ticketPrice);
		System.out.println("Blue :"+blue);
		System.out.println("Number of compartments :"+noOfCompartments);
		System.out.println("Comfortable :"+comfortable);
		System.out.println("Distance :"+distance);



		
		
	}

}
