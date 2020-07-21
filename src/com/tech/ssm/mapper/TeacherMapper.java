package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Teacher;

public interface TeacherMapper {
	
	Teacher selectByPrimaryKey(String teacher_id);
	
	int deleteByPrimaryKey (String teacher_id);
	
	int insert(Teacher teacher);
	
	int insertSelective (Teacher teacher);
	
	int updateByPrimaryKeySelective (Teacher teacher);
	
	int updateByPrimaryKey (Teacher teacher);
	
	List<Teacher>queryAll(Teacher teacher);

}
