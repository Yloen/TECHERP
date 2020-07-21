package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Student;


public interface StudentMapper {
	Student selectByPrimaryKey(String student_id);
	
	int deleteByPrimaryKey (String student_id);
	
	int insert(Student student);
	
	int insertSelective (Student student);
	
	int updateByPrimaryKeySelective (Student student);
	
	int updateByPrimaryKey (Student student);
	
	List<Student>queryAll(Student student);
}
