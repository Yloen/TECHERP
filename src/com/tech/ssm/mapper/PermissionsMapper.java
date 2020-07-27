package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Permissions;

public interface PermissionsMapper {
	
Permissions selectByPrimaryKey(String permissions_id);
	
	int deleteByPrimaryKey (String permissions_id);
	
	int insert(Permissions permissions);
	
	int insertSelective (Permissions permissions);
	
	int updateByPrimaryKeySelective (Permissions permissions);
	
	int updateByPrimaryKey (Permissions permissions);
	
	List<Permissions>queryAll(Permissions permissions);

}
