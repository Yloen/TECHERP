package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Professional;

public interface ProfessionalService {
	
	Professional selectByPrimaryKey(String professional_id);
	
	int deleteByPrimaryKey (String professional_id);
	
	int insert(Professional professional);
	
	int insertSelective (Professional professional);
	
	int updateByPrimaryKeySelective (Professional professional);
	
	int updateByPrimaryKey (Professional professional);
	
	List<Professional>queryAll(Professional professional);
}
