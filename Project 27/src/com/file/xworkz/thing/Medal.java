package com.file.xworkz.thing;

public class Medal {
	
      public String name;
      public String type;
      public String competitionName;
      public double cashPrize;
      public boolean firstPrize;
      public String level;
      public String place;
      public float ribbonLength;
      public float diameter;
      public String ribbonColour;
      public String coachName;
      public int rank;
      public boolean goldCoated;
      public String createdBy;
      
      
      public void display() {
    	  System.out.println("Name of the Medal :"+name);
    	  System.out.println("Type of the Medal :"+type);
    	  System.out.println("Name of the Competition :"+competitionName);
    	  System.out.println("Cash prize :"+cashPrize);
    	  System.out.println("First prize :"+firstPrize);
    	  System.out.println("Competition level :"+level);
    	  System.out.println("Place :"+place);
    	  System.out.println("Length of the ribbon :"+ribbonLength);
    	  System.out.println("Diameter of the Medal :"+diameter);
    	  System.out.println("Color of the ribbon :"+ribbonColour);
    	  System.out.println("Name of the Coach :"+coachName);
    	  System.out.println("Rank :"+rank);
    	  System.out.println("Gold coated :"+goldCoated);
    	  System.out.println("First created by :"+createdBy);
    	    
      }

}
