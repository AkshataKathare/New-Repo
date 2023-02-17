package com.file.xworkz.technical;

public class CountSpace {

	public static void main(String[] args) {
		
		String name="a k s h a t a";
		char ch[]=name.toCharArray();
		int countSpace=0;	
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') {
			   countSpace +=1;
			}
			
		}
		System.out.println("Number of space "+countSpace);


	}

}
