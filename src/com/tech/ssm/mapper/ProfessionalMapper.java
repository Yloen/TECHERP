package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Professional;

public interface ProfessionalMapper {
	
	Professional selectByPrimaryKey(String professional_id);
	
	int deleteByPrimaryKey (String professional_id);
	
	int insert(Professional professional);
	
	int insertSelective (Professional professional);
	
	int updateByPrimaryKeySelective (Professional professional);
	
	int updateByPrimaryKey (Professional professional);
	
	List<Professional>queryAll(Professional professional);
}
