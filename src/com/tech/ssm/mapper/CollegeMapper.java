package com.tech.ssm.mapper;

import java.util.List;


import com.tech.ssm.domain.College;

public interface CollegeMapper {
	
	College selectByPrimaryKey(String college_id);
	
	int deleteByPrimaryKey (String college_id);
	
	int insert(College college);
	
	int insertSelective (College college);
	
	int updateByPrimaryKeySelective (College college);
	
	int updateByPrimaryKey (College college);
	
	List<College>queryAll(College college);
}
