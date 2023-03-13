package com.xworkz.application.boot;

import com.xworkz.application.dto.MarketDTO;

public class MarketRunner {

	public static void main(String[] args) {

		MarketDTO marketDTO = new MarketDTO();
		marketDTO.setArea(200.5);
		marketDTO.setGoodRate(true);
		marketDTO.setLocation("Gandhi Chowk");
		marketDTO.setName("Fish Market");
		marketDTO.setNearBy(true);
		System.out.println(marketDTO);

		boolean same = marketDTO.equals(marketDTO);
		System.out.println(same);
		int hash = marketDTO.hashCode();
		System.out.println(hash);
	}

}
