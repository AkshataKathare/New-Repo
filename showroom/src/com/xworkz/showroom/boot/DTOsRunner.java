package com.xworkz.showroom.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.showroom.configuration.ShowRoomConfiguration;
import com.xworkz.showroom.dto.PolishDTO;
import com.xworkz.showroom.dto.SalesManagerDTO;
import com.xworkz.showroom.dto.ShoeShowRoomDTO;
import com.xworkz.showroom.dto.SockDTO;
import com.xworkz.showroom.service.PolishService;
import com.xworkz.showroom.service.SalesManagerService;
import com.xworkz.showroom.service.ShowRoomService;
import com.xworkz.showroom.service.SockService;

public class DTOsRunner {

	public static void main(String[] args) {

		ApplicationContext spring = new AnnotationConfigApplicationContext(ShowRoomConfiguration.class);

		ShowRoomService roomService = spring.getBean(ShowRoomService.class);
		ShoeShowRoomDTO room = new ShoeShowRoomDTO(5, "BATA", "Rajajinagar", "GST 9098");
		room.show();
		boolean saved = roomService.validateAndThenSave(room);
		System.out.println("Saved :" + saved);

		System.out.println("==============================");

		ShoeShowRoomDTO room1 = new ShoeShowRoomDTO(5, "PARAGOAN", "GandhiChowk", "GST345678");
		boolean saved1 = roomService.validateAndThenSave(room1);
		System.out.println("Saved :" + saved1);

		System.out.println("==============================");

		System.out.println("Polish");

		PolishService polishService = spring.getBean(PolishService.class);
		PolishDTO dto = new PolishDTO("Paragoan", "Black");
		boolean savedPolish = polishService.validateAndThenSave(dto);
		System.out.println(savedPolish);

		System.out.println("==============================");

		System.out.println("SalesManager");

		SalesManagerService managerService = spring.getBean(SalesManagerService.class);
		SalesManagerDTO managerDTO = new SalesManagerDTO("Vikas", "vikas@gmail.com");
		boolean savedSalesManagaer = managerService.validateAndThenSave(managerDTO);
		System.out.println("savedSalesManagaer :" + savedSalesManagaer);

		System.out.println("==============================");

		System.out.println("Sock");

		SockService service = spring.getBean(SockService.class);
		SockDTO sockDTO = new SockDTO("Grey Color", 17);
		boolean savedSock = service.validateAndThenSave(sockDTO);
		System.out.println("savedSock :" + savedSock);
	}

}
