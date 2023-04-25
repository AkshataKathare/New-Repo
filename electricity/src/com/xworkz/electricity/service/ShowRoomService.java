package com.xworkz.electricity.service;

import com.xworkz.electricity.dto.ShowRoomDTO;

public interface ShowRoomService {

	boolean validateAndThenSave(ShowRoomDTO dto);

}
