package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Resources;
import com.tech.ssm.mapper.ResourcesMapper;
import com.tech.ssm.service.ResourcesService;

@Service
public class ResourcesServiceImpl implements ResourcesService {
	@Autowired
	ResourcesMapper resourcesMapper;

	@Override
	public Resources selectByPrimaryKey(String resources_id) {

		return resourcesMapper.selectByPrimaryKey(resources_id);
	}

	@Override
	public int deleteByPrimaryKey(String resources_id) {

		return resourcesMapper.deleteByPrimaryKey(resources_id);
	}

	@Override
	public int insert(Resources resources) {

		return resourcesMapper.insert(resources);
	}

	@Override
	public int insertSelective(Resources resources) {

		return resourcesMapper.insertSelective(resources);
	}

	@Override
	public int updateByPrimaryKeySelective(Resources resources) {

		return resourcesMapper.updateByPrimaryKeySelective(resources);
	}

	@Override
	public int updateByPrimaryKey(Resources resources) {

		return resourcesMapper.updateByPrimaryKey(resources);
	}

	@Override
	public List<Resources> queryAll(Resources resources) {

		return resourcesMapper.queryAll(resources);
	}

}
