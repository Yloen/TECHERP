package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Personal;

public interface PersonalMapper {
	
	Personal selectByPrimaryKey(String personal_id);
	
	int deleteByPrimaryKey (String personal_id);
	
	int insert(Personal personal);
	
	int insertSelective (Personal personal);
	
	int updateByPrimaryKeySelective (Personal personal);
	
	int updateByPrimaryKey (Personal personal);
	
	List<Personal>queryAll(Personal personal);
}
