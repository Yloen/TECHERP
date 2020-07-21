package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Employment;

public interface EmploymentMapper {
	
	Employment selectByPrimaryKey(String employment_id);
	
	int deleteByPrimaryKey (String employment_id);
	
	int insert(Employment employment);
	
	int insertSelective (Employment employment);
	
	int updateByPrimaryKeySelective (Employment employment);
	
	int updateByPrimaryKey (Employment employment);
	
	List<Employment>queryAll(Employment employment);
}
