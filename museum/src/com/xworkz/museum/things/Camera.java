package com.xworkz.museum.things;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Camera {

	@Autowired
	private Guide guide;
}
