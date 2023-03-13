package com.xworkz.application.boot;

import com.xworkz.application.dto.AttendanceDTO;

public class AttendanceRunner {

	public static void main(String[] args) {

		AttendanceDTO attendanceDTO = new AttendanceDTO();
		attendanceDTO.setDay("Monday");
		attendanceDTO.setInstitute("X-workz");
		attendanceDTO.setNoOfAbsentees(5);
		attendanceDTO.setNoOfPresentees(17);
		attendanceDTO.setNoOfTrainees(22);
		System.out.println(attendanceDTO);
		int hash = attendanceDTO.hashCode();
		System.out.println(hash);
		boolean same = attendanceDTO.equals(attendanceDTO);
		System.out.println(same);
	}

}
