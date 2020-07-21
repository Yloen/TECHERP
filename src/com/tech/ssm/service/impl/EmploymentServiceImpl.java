package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Employment;
import com.tech.ssm.mapper.EmploymentMapper;
import com.tech.ssm.service.EmploymentService;

@Service
public class EmploymentServiceImpl implements EmploymentService {
	@Autowired
	EmploymentMapper employmenMapper;

	@Override
	public Employment selectByPrimaryKey(String employment_id) {

		return employmenMapper.selectByPrimaryKey(employment_id);
	}

	@Override
	public int deleteByPrimaryKey(String employment_id) {

		return employmenMapper.deleteByPrimaryKey(employment_id);
	}

	@Override
	public int insert(Employment employment) {

		return employmenMapper.insert(employment);
	}

	@Override
	public int insertSelective(Employment employment) {

		return employmenMapper.insertSelective(employment);
	}

	@Override
	public int updateByPrimaryKeySelective(Employment employment) {

		return employmenMapper.updateByPrimaryKeySelective(employment);
	}

	@Override
	public int updateByPrimaryKey(Employment employment) {

		return employmenMapper.updateByPrimaryKey(employment);
	}

	@Override
	public List<Employment> queryAll(Employment employment) {

		return employmenMapper.queryAll(employment);
	}

}
