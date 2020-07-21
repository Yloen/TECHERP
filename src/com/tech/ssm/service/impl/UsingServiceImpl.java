package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Using;
import com.tech.ssm.mapper.UsingMapper;
import com.tech.ssm.service.UsingService;

@Service
public class UsingServiceImpl implements UsingService {
	@Autowired
	UsingMapper usingmapper;

	@Override
	public Using selectByPrimaryKey(String using_id) {

		return usingmapper.selectByPrimaryKey(using_id);
	}

	@Override
	public int deleteByPrimaryKey(String using_id) {

		return usingmapper.deleteByPrimaryKey(using_id);
	}

	@Override
	public int insert(Using using) {

		return usingmapper.insert(using);
	}

	@Override
	public int insertSelective(Using using) {

		return usingmapper.insertSelective(using);
	}

	@Override
	public int updateByPrimaryKeySelective(Using using) {

		return usingmapper.updateByPrimaryKeySelective(using);
	}

	@Override
	public int updateByPrimaryKey(Using Using) {

		return usingmapper.updateByPrimaryKey(Using);
	}

	@Override
	public List<Using> queryAll(Using using) {

		return usingmapper.queryAll(using);
	}

}
