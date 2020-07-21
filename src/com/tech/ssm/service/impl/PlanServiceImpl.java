package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Plan;
import com.tech.ssm.mapper.PlanMapper;
import com.tech.ssm.service.PlanService;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	PlanMapper planMapper;

	@Override
	public Plan selectByPrimaryKey(String plan_id) {

		return planMapper.selectByPrimaryKey(plan_id);
	}

	@Override
	public int deleteByPrimaryKey(String plan_id) {

		return planMapper.deleteByPrimaryKey(plan_id);
	}

	@Override
	public int insert(Plan plan) {

		return planMapper.insert(plan);
	}

	@Override
	public int insertSelective(Plan plan) {

		return planMapper.insertSelective(plan);
	}

	@Override
	public int updateByPrimaryKeySelective(Plan plan) {

		return planMapper.updateByPrimaryKeySelective(plan);
	}

	@Override
	public int updateByPrimaryKey(Plan plan) {

		return planMapper.updateByPrimaryKey(plan);
	}

	@Override
	public List<Plan> queryAll(Plan plan) {

		return planMapper.queryAll(plan);
	}

}
