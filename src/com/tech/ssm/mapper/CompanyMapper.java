package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Company;

public interface CompanyMapper {
	
	Company selectByPrimaryKey(String company_id);
	
	int deleteByPrimaryKey (String company_id);
	
	int insert(Company company);
	
	int insertSelective (Company company);
	
	int updateByPrimaryKeySelective (Company company);
	
	int updateByPrimaryKey (Company company);
	
	List<Company>queryAll(Company company);
}
