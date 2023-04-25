package com.xworkz.electricity.boot;

import java.time.LocalDate;

import com.xworkz.electricity.constant.ShowRoomLocation;
import com.xworkz.electricity.dto.ShowRoomDTO;
import com.xworkz.electricity.repository.ShowRoomRepository;
import com.xworkz.electricity.repository.ShowRoomRepositoryImpl;
import com.xworkz.electricity.service.ShowRoomService;
import com.xworkz.electricity.service.ShowRoomServiceImpl;

public class ShowRoomRunner {

	public static void main(String[] args) {

		ShowRoomDTO showRoomDTO = new ShowRoomDTO(23, "Bata", ShowRoomLocation.BHASHYAM_CIRCLE, 34,
				LocalDate.of(2014, 3, 12), true);

		ShowRoomRepository showRoomRepository = new ShowRoomRepositoryImpl();
		ShowRoomService roomService = new ShowRoomServiceImpl(showRoomRepository);
		boolean saved = roomService.validateAndThenSave(showRoomDTO);
		System.out.println("dto is saved :" + saved);
	}

}
