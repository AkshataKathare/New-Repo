package com.file.xworkz.thing;

public class Image {
     public String type;
     public int size;
     public boolean colored;
     public char quality;
     public String borderColor;
     public String camera;
     public String cameraMan;
     public boolean tree;
     public int MP;
     
     public Image(String arg1) {
    	 type=arg1;
     }
     public Image(int arg2) {
    	 size=arg2;
     }
     public Image(boolean arg3) {
    	 colored=arg3;
     }
     public Image(char arg4) {
    	 quality=arg4;
     }
     public Image(String arg5,String arg6) {
    	 borderColor=arg5;
    	 camera=arg6;
     }
     public Image(String arg7,String arg8,String arg9) {
    	 borderColor=arg7;
    	 camera=arg8;
    	 cameraMan=arg9;
     }
     public Image(boolean arg10,int arg11) {
    	 tree=arg10;
    	 MP=arg11;
     }
     public Image() {
    	 System.out.println("No-arg constructor");
     }
     
    
     public void show() {
    	 System.out.println("Image type :"+type);
    	 System.out.println("Image size :"+size);
    	 System.out.println("Colored :"+colored);
    	 System.out.println("Image quality :"+quality);
    	 System.out.println("Color of the border :"+borderColor);
    	 System.out.println("Camera :"+camera);
    	 System.out.println("Camera man :"+cameraMan);
    	 System.out.println("Tree present :"+tree);
    	 System.out.println("MP :"+MP);
    	 
     }
	
}
