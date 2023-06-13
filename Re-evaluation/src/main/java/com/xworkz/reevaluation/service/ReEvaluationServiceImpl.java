package com.xworkz.reevaluation.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;
import com.xworkz.reevaluation.entity.ReEvaluationEntity;

@Service
public class ReEvaluationServiceImpl implements ReEvaluationService {

	public ReEvaluationServiceImpl() {
		System.out.println("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean valideAndThenSave(ReEvaluationDTO dto) {
		System.out.println("Running validateAndThenSave method in DLServiceImpl " + dto);

		ReEvaluationEntity entity = new ReEvaluationEntity();
		BeanUtils.copyProperties(dto, entity);
		System.out.println("After copying the properties of dto in entity " + entity);

		return false;
	}

}
