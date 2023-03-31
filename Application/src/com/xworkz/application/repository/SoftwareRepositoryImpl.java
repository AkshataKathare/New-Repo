package com.xworkz.application.repository;

import com.xworkz.application.dto.SoftwareDTO;

public class SoftwareRepositoryImpl implements SoftwareRepository {

	private SoftwareDTO[] softwareDTOs = new SoftwareDTO[10];
	private int softwareIndex = 0;

	@Override
	public boolean save(SoftwareDTO dto) {

		if (this.softwareIndex < this.softwareDTOs.length) {
			this.softwareDTOs[softwareIndex] = dto;
			System.out.println("dto is saved at the index:" + this.softwareIndex + " " + dto);
			this.softwareIndex++;
			return true;
		}

		return false;
	}

	@Override
	public boolean isExist(SoftwareDTO dto) {
		if (softwareIndex == 0) {
			System.out.println("first element will not check");
			return false;
		}
		for (int index = 0; index < this.softwareIndex; index++) {
			SoftwareDTO ele = this.softwareDTOs[index];
			if (ele.equals(dto)) {
				System.out.println("Two are same ,and will not be saved");
				return true;
			}
		}

		return false;
	}

	@Override
	public int totalSaved() {
		return this.softwareIndex;
	}

	@Override
	public SoftwareDTO findById(int id) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref = this.softwareDTOs[index];
			if (ref.getId() == id) {
				System.out.println("dto is found for id:" + id);
				return ref;
			}
		}
		return null;

	}

	@Override
	public SoftwareDTO findByName(String name) {
		for (int index = 0; index < this.softwareDTOs.length; index++) {
			SoftwareDTO ref1 = this.softwareDTOs[index];
			if (ref1.getName().equals(name)) {
				System.out.println("dto is found for Name:" + name);
				return ref1;
			}
		}
		return null;
	}
	
	@Override
	public SoftwareDTO findByNameAndId(String name, int id) {
		for(int index=0;index<softwareDTOs.length;index++) {
			SoftwareDTO ref2=this.softwareDTOs[index];
			if(ref2.getId()==id) {
				System.out.println("dto is found for id:"+id);
				return ref2;
			}
			if(ref2.getName().equals(name)) {
				System.out.println("dto is found for name:"+name);
				return ref2;
			}
		}
		return null;
	}
}
