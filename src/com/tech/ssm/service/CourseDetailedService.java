package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.CourseDetailed;

public interface CourseDetailedService {
	CourseDetailed selectByPrimaryKey(String id);

	int deleteByPrimaryKey(String id);

	int insert(CourseDetailed CourseDetailed);

	int insertSelective(CourseDetailed CourseDetailed);

	int updateByPrimaryKeySelective(CourseDetailed CourseDetailed);

	int updateByPrimaryKey(CourseDetailed CourseDetailed);

	List<CourseDetailed> queryAll(CourseDetailed CourseDetailed);

}
