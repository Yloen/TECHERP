package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.PlanType;
import com.tech.ssm.mapper.PlanTypeMapper;
import com.tech.ssm.service.PlanTypeService;

@Service
public class PlanTypeServiceImpl implements PlanTypeService {
	@Autowired
	PlanTypeMapper planTypeMapper;

	@Override
	public PlanType selectByPrimaryKey(String planType_id) {

		return planTypeMapper.selectByPrimaryKey(planType_id);
	}

	@Override
	public int deleteByPrimaryKey(String planType_id) {

		return planTypeMapper.deleteByPrimaryKey(planType_id);
	}

	@Override
	public int insert(PlanType planType) {

		return planTypeMapper.insert(planType);
	}

	@Override
	public int insertSelective(PlanType planType) {

		return planTypeMapper.insertSelective(planType);
	}

	@Override
	public int updateByPrimaryKeySelective(PlanType planType) {

		return planTypeMapper.updateByPrimaryKeySelective(planType);
	}

	@Override
	public int updateByPrimaryKey(PlanType planType) {

		return planTypeMapper.updateByPrimaryKey(planType);
	}

	@Override
	public List<PlanType> queryAll(PlanType planType) {

		return planTypeMapper.queryAll(planType);
	}

}
