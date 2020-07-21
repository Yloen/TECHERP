package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Admissions;
import com.tech.ssm.mapper.AdmissionsMapper;
import com.tech.ssm.service.AdmissionsService;

@Service
public class AdmissionsServiceImpl implements AdmissionsService {
	@Autowired
	AdmissionsMapper admissionsMapper;

	@Override
	public Admissions selectByPrimaryKey(String admissions_id) {

		return admissionsMapper.selectByPrimaryKey(admissions_id);
	}

	@Override
	public int deleteByPrimaryKey(String admissions_id) {

		return admissionsMapper.deleteByPrimaryKey(admissions_id);
	}

	@Override
	public int insert(Admissions admissions) {

		return admissionsMapper.insert(admissions);
	}

	@Override
	public int insertSelective(Admissions admissions) {

		return admissionsMapper.insertSelective(admissions);
	}

	@Override
	public int updateByPrimaryKeySelective(Admissions admissions) {

		return admissionsMapper.updateByPrimaryKeySelective(admissions);
	}

	@Override
	public int updateByPrimaryKey(Admissions admissions) {

		return admissionsMapper.updateByPrimaryKey(admissions);
	}

	@Override
	public List<Admissions> queryAll(Admissions admissions) {

		return admissionsMapper.queryAll(admissions);
	}

}
