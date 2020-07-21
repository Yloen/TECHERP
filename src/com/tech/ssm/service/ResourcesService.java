package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Resources;

public interface ResourcesService {

	Resources selectByPrimaryKey(String resources_id);

	int deleteByPrimaryKey(String resources_id);

	int insert(Resources resources);

	int insertSelective(Resources resources);

	int updateByPrimaryKeySelective(Resources resources);

	int updateByPrimaryKey(Resources resources);

	List<Resources> queryAll(Resources resources);

}
