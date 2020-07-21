package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Professional;
import com.tech.ssm.mapper.ProfessionalMapper;
import com.tech.ssm.service.ProfessionalService;

@Service
public class ProfessionalServiceImpl implements ProfessionalService {
	@Autowired
	ProfessionalMapper professionalMapper;

	@Override
	public Professional selectByPrimaryKey(String professional_id) {

		return professionalMapper.selectByPrimaryKey(professional_id);
	}

	@Override
	public int deleteByPrimaryKey(String professional_id) {

		return professionalMapper.deleteByPrimaryKey(professional_id);
	}

	@Override
	public int insert(Professional professional) {

		return professionalMapper.insert(professional);
	}

	@Override
	public int insertSelective(Professional professional) {

		return professionalMapper.insertSelective(professional);
	}

	@Override
	public int updateByPrimaryKeySelective(Professional professional) {

		return professionalMapper.updateByPrimaryKeySelective(professional);
	}

	@Override
	public int updateByPrimaryKey(Professional professional) {

		return professionalMapper.updateByPrimaryKey(professional);
	}

	@Override
	public List<Professional> queryAll(Professional professional) {

		return professionalMapper.queryAll(professional);
	}

}
