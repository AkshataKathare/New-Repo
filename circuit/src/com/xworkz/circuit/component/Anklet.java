package com.xworkz.circuit.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Anklet {

	@Value("Silver")
	private String material;
	@Value("3000.0")
	private double cost;
	@Value("Yashodha Jewellers")
	private String jewelleryShop;
	@Value("Bindu")
	private String woreBy;
	@Value("2.78")
	private double weight;
	@Value("5.8")
	private double length;
	@Value("true")
	private boolean shining;
	@Value("false")
	private boolean costly;
	@Value("30-5-2002")
	private String broughtOn;
	@Value("true")
	private boolean good;

	public String giftedBy() {
		System.out.println("Running giftedBy method in Anklet");
		return "Pappa";
	}

}
