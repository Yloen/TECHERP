package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.PlanType;

public interface PlanTypeService {
	
	PlanType selectByPrimaryKey(String planType_id);
	
	int deleteByPrimaryKey (String planType_id);
	
	int insert(PlanType planType);
	
	int insertSelective (PlanType planType);
	
	int updateByPrimaryKeySelective (PlanType planType);
	
	int updateByPrimaryKey (PlanType planType);
	
	List<PlanType>queryAll(PlanType planType);
}
