package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Employment;

public interface EmploymentService {
	
	Employment selectByPrimaryKey(String employment_id);
	
	int deleteByPrimaryKey (String employment_id);
	
	int insert(Employment employment);
	
	int insertSelective (Employment employment);
	
	int updateByPrimaryKeySelective (Employment employment);
	
	int updateByPrimaryKey (Employment employment);
	
	List<Employment>queryAll(Employment employment);
}
