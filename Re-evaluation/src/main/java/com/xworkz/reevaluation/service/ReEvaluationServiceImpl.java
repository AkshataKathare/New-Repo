package com.xworkz.reevaluation.service;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.xworkz.reevaluation.dto.ReEvaluationDTO;
import com.xworkz.reevaluation.entity.ReEvaluationEntity;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReEvaluationServiceImpl implements ReEvaluationService {

	public ReEvaluationServiceImpl() {
		log.info("Created " + this.getClass().getSimpleName());
	}

	@Override
	public boolean valideAndThenSave(ReEvaluationDTO dto) {
		log.info("Running validateAndThenSave method in DLServiceImpl " + dto);

		ReEvaluationEntity entity = new ReEvaluationEntity();
		BeanUtils.copyProperties(dto, entity);
		log.info("After copying the properties of dto in entity " + entity);

		return false;
	}

}
