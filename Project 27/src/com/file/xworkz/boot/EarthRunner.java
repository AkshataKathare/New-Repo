package com.file.xworkz.boot;

import  com.file.xworkz.thing.Earth;

public class EarthRunner {

	public static void main(String[] args) {
       Earth earth=new Earth();
       
       earth.type="Living planet";
       earth.diameter=12756;
       earth.age=4543;
       earth.water=true;    	      	   
       earth.mass=597219;	   
       earth.gravity=true;
       earth.ocean=71;
       earth.land=29;
       earth.noOfContinents=7;
       earth.shape="Ellipsoidal";
       earth.circumference=40075;
       earth.naturalSatellite="Moon";
       earth.greenHouseGas="Carbon dioxide";
       earth.nitrogen=78;
       earth.oxygen=20;
       earth.argon=0.93F;
       earth.noOfOceans=7;
       earth.noOfSeas=50;
       earth.magneticField=true;
       earth.waterComposition=71;
       earth.recycled=true;
       earth.layer1="Troposphere";
       earth.layer2="Stratosphere";
       earth.layer3="Mesoshere";
       earth.layer4="Thermosphere";
       
       earth.display();
    		   
	}

}
