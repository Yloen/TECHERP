package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Teacher;
import com.tech.ssm.mapper.TeacherMapper;
import com.tech.ssm.service.TeacherService;

@Service
public class TeacherServiceImpl implements TeacherService {
	@Autowired
	TeacherMapper teacherMapper;

	@Override
	public Teacher selectByPrimaryKey(String teacher_id) {

		return teacherMapper.selectByPrimaryKey(teacher_id);
	}

	@Override
	public int deleteByPrimaryKey(String teacher_id) {

		return teacherMapper.deleteByPrimaryKey(teacher_id);
	}

	@Override
	public int insert(Teacher teacher) {

		return teacherMapper.insert(teacher);
	}

	@Override
	public int insertSelective(Teacher teacher) {

		return teacherMapper.insertSelective(teacher);
	}

	@Override
	public int updateByPrimaryKeySelective(Teacher teacher) {

		return teacherMapper.updateByPrimaryKeySelective(teacher);
	}

	@Override
	public int updateByPrimaryKey(Teacher teacher) {

		return teacherMapper.updateByPrimaryKey(teacher);
	}

	@Override
	public List<Teacher> queryAll(Teacher teacher) {

		return teacherMapper.queryAll(teacher);
	}

}
