package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Squad;

public interface SquadService {
Squad selectByPrimaryKey(String squad_id);
	
	int deleteByPrimaryKey (String squad_id);
	
	int insert(Squad squad);
	
	int insertSelective (Squad squad);
	
	int updateByPrimaryKeySelective (Squad squad);
	
	int updateByPrimaryKey (Squad squad);
	
	List<Squad>queryAll(Squad squad);

}
