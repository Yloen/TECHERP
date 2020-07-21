package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.College;
import com.tech.ssm.mapper.CollegeMapper;
import com.tech.ssm.service.CollegeService;

@Service
public class CollegeServiceImpl implements CollegeService {
	@Autowired
	CollegeMapper collegeMapper;

	@Override
	public College selectByPrimaryKey(String college_id) {

		return collegeMapper.selectByPrimaryKey(college_id);
	}

	@Override
	public int deleteByPrimaryKey(String college_id) {

		return collegeMapper.deleteByPrimaryKey(college_id);
	}

	@Override
	public int insert(College college) {

		return collegeMapper.insert(college);
	}

	@Override
	public int insertSelective(College college) {

		return collegeMapper.insertSelective(college);
	}

	@Override
	public int updateByPrimaryKeySelective(College college) {

		return collegeMapper.updateByPrimaryKeySelective(college);
	}

	@Override
	public int updateByPrimaryKey(College college) {

		return collegeMapper.updateByPrimaryKey(college);
	}

	@Override
	public List<College> queryAll(College college) {

		return collegeMapper.queryAll(college);
	}

}
