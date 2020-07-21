package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.CourseDetailed;

public interface CourseDetailedMapper {
	CourseDetailed selectByPrimaryKey(String id);

	int deleteByPrimaryKey(String id);

	int insert(CourseDetailed CourseDetailed);

	int insertSelective(CourseDetailed CourseDetailed);

	int updateByPrimaryKeySelective(CourseDetailed CourseDetailed);

	int updateByPrimaryKey(CourseDetailed CourseDetailed);

	List<CourseDetailed> queryAll(CourseDetailed CourseDetailed);

}
