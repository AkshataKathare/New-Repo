package com.xworkz.showroom.service;

import com.xworkz.showroom.dto.ShoeShowRoomDTO;

public interface ShowRoomService {

	boolean validateAndThenSave(ShoeShowRoomDTO room);
}
