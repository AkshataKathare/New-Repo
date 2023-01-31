package com.file.xworkz.boot;

import com.file.xworkz.thing.Beer;

public class BeerRunner {

	public static void main(String[] args) {
		
		Beer ref=new Beer();
		
		ref.brand="Black & White";
		ref.type="Alcohol";
		ref.color="Brown";
		ref.aroma="Not good"; 
		ref.cost=200;
		ref.quantity=20;
		ref.good=false; 
		ref.process="Fermentation";
		ref.alcoholContent=5;
		ref.smell="Bitter";
		ref.mouthFeel="Bitter";
		ref.ingredient1="Yeast";
		ref.ingredient2="Water";
		ref.ingredient3="Malt";
		ref.ingredient4="Hops";
		ref.chemical="Hydrocarbons";
		ref.no1Beer="Kingfisher";
		ref.fresh=true; 
		ref.causeHeartDisease=true;
		ref.companyHeadQuarters="Scotland";
		
		ref.display();
		
		System.out.println("========================");
		
       Beer ref2=new Beer();
		
		ref2.brand="Kingfisher";
		ref2.type="Alcohol";
		ref2.color="Red";
		ref2.aroma="Not good"; 
		ref2.cost=1000;
		ref2.quantity=40;
		ref2.good=true; 
		ref2.process="Fermentation";
		ref2.alcoholContent=7;
		ref2.smell="Sour";
		ref2.mouthFeel="Bitter";
		ref2.ingredient1="Yeast";
		ref2.ingredient2="Water";
		ref2.ingredient3="Malt";
		ref2.ingredient4="Hops";
		ref2.chemical="Hydrocarbons";
		ref2.no1Beer="Kingfisher";
		ref2.fresh=false; 
		ref2.causeHeartDisease=false;
		ref2.companyHeadQuarters="London";
		
		ref2.display();
		
	}

}
