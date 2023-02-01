package com.file.xworkz.thing;

public class Message {
	
	public String type;
	public boolean textual;
	public int lines;
	public float storage;
	public double time;
	
	public Message(String arg1) {
		type=arg1;
	}
	public Message(boolean arg2) {
		textual=arg2;
	}
	
	public Message(int arg3) {
		lines=arg3;
	}
	
	public Message(float arg4) {
		storage=arg4;
	}
	
	public Message(double arg5) {
		time=arg5;
	}
	public void show() {
		System.out.println("Type of messsage :"+type);
		System.out.println("Textual :"+textual);
		System.out.println("Number of lines :"+lines);
		System.out.println("Storage :"+storage);
		System.out.println("Message time :"+time);
		
	}

}
