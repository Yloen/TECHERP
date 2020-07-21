package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.CourseDetailed;
import com.tech.ssm.mapper.CourseDetailedMapper;
import com.tech.ssm.service.CourseDetailedService;

@Service
public class CourseDetailedServiceImpl implements CourseDetailedService {
	@Autowired
	CourseDetailedMapper courseDetailedmapper;

	@Override
	public CourseDetailed selectByPrimaryKey(String id) {

		return courseDetailedmapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteByPrimaryKey(String id) {

		return courseDetailedmapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(CourseDetailed CourseDetailed) {

		return courseDetailedmapper.insert(CourseDetailed);
	}

	@Override
	public int insertSelective(CourseDetailed CourseDetailed) {

		return courseDetailedmapper.insertSelective(CourseDetailed);
	}

	@Override
	public int updateByPrimaryKeySelective(CourseDetailed CourseDetailed) {

		return courseDetailedmapper.updateByPrimaryKeySelective(CourseDetailed);
	}

	@Override
	public int updateByPrimaryKey(CourseDetailed CourseDetailed) {

		return courseDetailedmapper.updateByPrimaryKey(CourseDetailed);
	}

	@Override
	public List<CourseDetailed> queryAll(CourseDetailed CourseDetailed) {

		return courseDetailedmapper.queryAll(CourseDetailed);
	}

}
