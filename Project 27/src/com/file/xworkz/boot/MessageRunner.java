package com.file.xworkz.boot;

import com.file.xworkz.thing.Message;

public class MessageRunner {

	public static void main(String[] args) {
		
		Message ref1=new Message("SMS");
		ref1.show();
		
		System.out.println("================");
		
		Message ref2=new Message(true);
		ref2.show();
		
		System.out.println("================");
		
		Message ref3=new Message(10);
		ref3.show();
		
		System.out.println("================");
		
		Message ref4=new Message(2.5F);
		ref4.show();
		
		System.out.println("================");
		
		Message ref5=new Message(10.30D);
		ref5.show();
		
	}

}
