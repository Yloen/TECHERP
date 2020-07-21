package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Course;

public interface CourseMapper {
	Course selectByPrimaryKey(String course_id);
	
	int deleteByPrimaryKey (String course_id);
	
	int insert(Course course);
	
	int insertSelective (Course course);
	
	int updateByPrimaryKeySelective (Course course);
	
	int updateByPrimaryKey (Course course);
	
	List<Course>queryAll(Course course);
}
