package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Results;

public interface ResultsMapper {
	
	Results selectByPrimaryKey(String results_id);
	
	int deleteByPrimaryKey (String results_id);
	
	int insert(Results results);
	
	int insertSelective (Results results);
	
	int updateByPrimaryKeySelective (Results results);
	
	int updateByPrimaryKey (Results results);
	
	List<Results>queryAll(Results results);

}
