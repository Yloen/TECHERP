package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Personal;
import com.tech.ssm.mapper.PersonalMapper;
import com.tech.ssm.service.PersonalService;

@Service
public class PersonalServiceImpl implements PersonalService {

	@Autowired
	PersonalMapper personalMapper;

	@Override
	public Personal selectByPrimaryKey(String personal_id) {

		return personalMapper.selectByPrimaryKey(personal_id);
	}

	@Override
	public int deleteByPrimaryKey(String personal_id) {

		return personalMapper.deleteByPrimaryKey(personal_id);
	}

	@Override
	public int insert(Personal personal) {

		return personalMapper.insert(personal);
	}

	@Override
	public int insertSelective(Personal personal) {

		return personalMapper.insertSelective(personal);
	}

	@Override
	public int updateByPrimaryKeySelective(Personal personal) {

		return personalMapper.updateByPrimaryKeySelective(personal);
	}

	@Override
	public int updateByPrimaryKey(Personal personal) {

		return personalMapper.updateByPrimaryKey(personal);
	}

	@Override
	public List<Personal> queryAll(Personal personal) {

		return personalMapper.queryAll(personal);
	}

}
