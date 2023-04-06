package com.xworkz.application.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.application.dto.IndependenceDTO;
import com.xworkz.application.exception.IndependenceMemoryFullException;

public class IndependenceRepositoryImpl implements IndependenceRepository {

	private IndependenceDTO independenceDTOs[] = new IndependenceDTO[30];
	private int indepIndex = 0;

	@Override
	public boolean save(IndependenceDTO dto) {
		if (this.indepIndex < this.independenceDTOs.length) {
			this.independenceDTOs[indepIndex] = dto;
			System.out.println("independenceDTO is saved :" + dto + " at the index :" + this.indepIndex);
			this.indepIndex++;
			return true;
		} else {
			throw new IndependenceMemoryFullException(
					"Memory is full as the length of array is 3 ,hence,cannot add elements further");
		}
	}

	@Override
	public boolean isExist(IndependenceDTO dto) {
		if (this.indepIndex == 0) {
			System.out.println("first element will not be checked");
			return false;
		} else {
			for (int index = 0; index < this.independenceDTOs.length; index++) {
				IndependenceDTO ele = this.independenceDTOs[index];
				if (ele != null && ele.equals(dto)) {
					System.out.println("same ele exists");
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public IndependenceDTO find(IndependenceDTO dto) {
		for (int index = 0; index < this.independenceDTOs.length; index++) {
			IndependenceDTO ele2 = this.independenceDTOs[index];
			if (ele2 != null && ele2.equals(dto)) {
				System.out.println("this dto exists");
				return ele2;
			}
		}
		return null;
	}

	@Override
	public IndependenceDTO findByMonth(String month) {
		for (int index = 0; index < this.independenceDTOs.length; index++) {
			IndependenceDTO ele3 = this.independenceDTOs[index];
			if (ele3 != null && ele3.getMonth().equals(month)) {
				System.out.println("dto with this month exists :" + month);
				return ele3;
			}
		}
		return null;
	}

	@Override
	public String findgotFreedomFromBymainFreedomFighterAndyears(String mainFreedomFighter, int years) {
		for (int index = 0; index < this.independenceDTOs.length; index++) {
			IndependenceDTO ele4 = this.independenceDTOs[index];
			if (ele4 != null && ele4.getMainFreedomFighter().equals(mainFreedomFighter) && ele4.getYears() == years) {
				System.out
						.println("dto with this mainFreedomFighter,years exists :" + mainFreedomFighter + " " + years);
				return ele4.getGotFreeFrom();
			}
		}
		return null;

	}

	@Override
	public IndependenceDTO[] findAll() {
		if (this.indepIndex != 0) {
			return independenceDTOs;
		}

		return null;
	}

	@Override
	public IndependenceDTO findBymonthOrgotFreedomFromOrgotIndependenceOn(String month, String gotFreedomFrom,
			LocalDate gotIndependenceOn) {
		for (int index = 0; index < this.independenceDTOs.length; index++) {
			IndependenceDTO ele5 = this.independenceDTOs[index];
			if (ele5!=null && ele5.getMonth().equals(month) || ele5.getGotFreeFrom().equals(gotFreedomFrom)
					|| ele5.getGotIndependenceOn().equals(gotIndependenceOn)) {
				System.out.println("dto with this month,gotFreedomFrom,gotIndependenceOn");
				return ele5;
			}
		}
		return null;
	}

	@Override
	public int getTotal() {
		return this.indepIndex;
	}

}
