package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Plan;

public interface PlanService {
	
	Plan selectByPrimaryKey(String plan_id);
	
	int deleteByPrimaryKey (String plan_id);
	
	int insert(Plan plan);
	
	int insertSelective (Plan plan);
	
	int updateByPrimaryKeySelective (Plan plan);
	
	int updateByPrimaryKey (Plan plan);
	
	List<Plan>queryAll(Plan plan);
}
