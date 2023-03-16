package com.xworkz.application.boot;

import java.time.LocalDate;

import com.xworkz.application.constant.Brand;
import com.xworkz.application.constant.Color;
import com.xworkz.application.constant.TypeAndWeight;
import com.xworkz.application.dto.HeadPhoneDTO;
import com.xworkz.application.service.HeadPhoneService;
import com.xworkz.application.service.HeadPhoneServiceImpl;

public class HeadPhoneRunner {

	public static void main(String[] args) {

		HeadPhoneDTO headPhoneDTO = new HeadPhoneDTO();
		headPhoneDTO.setBass(false);
		headPhoneDTO.setBrand(Brand.ADIDAS);
		headPhoneDTO.setColor(Color.BLACK);
		headPhoneDTO.setCustomerName("Akshata");
		headPhoneDTO.setInvoiceNo(20);
		headPhoneDTO.setMfgDate(LocalDate.now());
		headPhoneDTO.setModelNo("qr1.2");
		headPhoneDTO.setPrice(2000);
		headPhoneDTO.setTypeAndWeight(TypeAndWeight.EARPODS);
		headPhoneDTO.setWarrantyPeriod(6);

		HeadPhoneService headPhoneService = new HeadPhoneServiceImpl();
		boolean saved = headPhoneService.validateAndThenSave(headPhoneDTO);
		System.out.println("Saved :" + saved);
	}

}
