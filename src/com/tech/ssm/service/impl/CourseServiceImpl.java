package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Course;
import com.tech.ssm.mapper.CourseMapper;
import com.tech.ssm.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	CourseMapper courseMapper;

	@Override
	public Course selectByPrimaryKey(String course_id) {

		return courseMapper.selectByPrimaryKey(course_id);
	}

	@Override
	public int deleteByPrimaryKey(String course_id) {

		return courseMapper.deleteByPrimaryKey(course_id);
	}

	@Override
	public int insert(Course course) {

		return courseMapper.insert(course);
	}

	@Override
	public int insertSelective(Course course) {

		return courseMapper.insertSelective(course);
	}

	@Override
	public int updateByPrimaryKeySelective(Course course) {

		return courseMapper.updateByPrimaryKeySelective(course);
	}

	@Override
	public int updateByPrimaryKey(Course course) {

		return courseMapper.updateByPrimaryKey(course);
	}

	@Override
	public List<Course> queryAll(Course course) {

		return courseMapper.queryAll(course);
	}

}
