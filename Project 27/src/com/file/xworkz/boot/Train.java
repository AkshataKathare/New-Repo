package com.file.xworkz.boot;

public class Train {
	
	String name;
	double time;
	boolean onTime;
	
	public Train(Train train) {
		this.name=train.name;
		this.time=train.time;
		this.onTime=train.onTime;
	}

}
