package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Student;
import com.tech.ssm.mapper.StudentMapper;
import com.tech.ssm.service.StudentService;

@Service
public class StudnetServiceImpl implements StudentService {
	@Autowired
	StudentMapper studentMapper;

	@Override
	public Student selectByPrimaryKey(String student_id) {

		return studentMapper.selectByPrimaryKey(student_id);
	}

	@Override
	public int deleteByPrimaryKey(String student_id) {

		return studentMapper.deleteByPrimaryKey(student_id);
	}

	@Override
	public int insert(Student student) {

		return studentMapper.insert(student);
	}

	@Override
	public int insertSelective(Student student) {

		return studentMapper.insertSelective(student);
	}

	@Override
	public int updateByPrimaryKeySelective(Student student) {

		return studentMapper.updateByPrimaryKeySelective(student);
	}

	@Override
	public int updateByPrimaryKey(Student student) {

		return studentMapper.updateByPrimaryKey(student);
	}

	@Override
	public List<Student> queryAll(Student student) {

		return studentMapper.queryAll(student);
	}

}
