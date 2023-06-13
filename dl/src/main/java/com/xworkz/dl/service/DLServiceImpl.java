package com.xworkz.dl.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.dl.dto.DrivingLicenseDTO;
import com.xworkz.dl.entity.DlEntity;

@Service
public class DLServiceImpl implements DLService {

	public DLServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
// resources
	}
	
	@Override
	public boolean validateAndSave(DrivingLicenseDTO dto) {
		System.out.println("executing ValidateAndSave "+dto);
		
		
		DlEntity dlEntity=new DlEntity();
		// property name should be same in both ref
		BeanUtils.copyProperties(dto, dlEntity);
		
		System.out.println("Entity after copy.."+dlEntity);
		
		
		
		
		
		return false;
	}

}
