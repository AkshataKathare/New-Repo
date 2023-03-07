package com.xworkz.link.boot;

import com.xworkz.link.things.Gournament;
import com.xworkz.link.things.TraficRule;

public class TraficRuleRunner {

	public static void main(String[] args) {
		TraficRule tr=new Gournament();
           String br=tr.breaks();
           System.out.println(br);
           int it=tr.noOfTravellers();
           System.out.println(it);
           double dl=tr.setTime();
           System.out.println(dl);
           int tax=tr.tax();
           System.out.println(tax);
           boolean wk=tr.works();
           System.out.println(wk);
           
           
	}

}
