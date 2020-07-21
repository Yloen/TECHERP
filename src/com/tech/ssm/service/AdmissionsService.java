package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Admissions;

public interface AdmissionsService {

	Admissions selectByPrimaryKey(String admissions_id);
	
	int deleteByPrimaryKey (String admissions_id);
	
	int insert(Admissions admissions);
	
	int insertSelective (Admissions admissions);
	
	int updateByPrimaryKeySelective (Admissions admissions);
	
	int updateByPrimaryKey (Admissions admissions);
	
	List<Admissions>queryAll(Admissions admissions);
}
