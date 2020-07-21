package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Student;

public interface StudentService {
	
		Student selectByPrimaryKey(String student_id);
		
		int deleteByPrimaryKey (String student_id);
		
		int insert(Student student);
		
		int insertSelective (Student student);
		
		int updateByPrimaryKeySelective (Student student);
		
		int updateByPrimaryKey (Student student);
		
		List<Student>queryAll(Student student);
	
	

}
