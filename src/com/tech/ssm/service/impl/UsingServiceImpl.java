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
	UsingMapper usingMapper;

	@Override
	public Using selectByPrimaryKey(String using_id) {

		return usingMapper.selectByPrimaryKey(using_id);
	}

	@Override
	public int deleteByPrimaryKey(String using_id) {

		return usingMapper.deleteByPrimaryKey(using_id);
	}

	@Override
	public int insert(Using using) {

		return usingMapper.insert(using);
	}

	@Override
	public int insertSelective(Using using) {

		return usingMapper.insertSelective(using);
	}

	@Override
	public int updateByPrimaryKeySelective(Using using) {

		return usingMapper.updateByPrimaryKeySelective(using);
	}

	@Override
	public int updateByPrimaryKey(Using Using) {

		return usingMapper.updateByPrimaryKey(Using);
	}

	@Override
	public List<Using> queryAll(Using using) {

		return usingMapper.queryAll(using);
	}

}
