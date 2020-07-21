package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.College;
import com.tech.ssm.domain.Squad;

public interface SquadMapper {
Squad selectByPrimaryKey(String squad_id);
	
	int deleteByPrimaryKey (String squad_id);
	
	int insert(Squad squad);
	
	int insertSelective (Squad squad);
	
	int updateByPrimaryKeySelective (Squad squad);
	
	int updateByPrimaryKey (Squad squad);
	
	List<Squad>queryAll(Squad squad);

}
