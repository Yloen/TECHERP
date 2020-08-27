package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Department;
import com.tech.ssm.mapper.DepartmentMapper;
import com.tech.ssm.service.DepartmentService;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentMapper departmentMapper;
	
	@Override
	public List<Department> find() {
		return departmentMapper.find();
	}

	@Override
	public int deleteByPrimaryKey(String departmentid) {
		return departmentMapper.deleteByPrimaryKey(departmentid);
	}

	@Override
	public int deleteBatch(String[] ids) {
		return departmentMapper.deleteBatch(ids);
	}

	@Override
	public int insert(Department record) {
		return departmentMapper.insert(record);
	}

	@Override
	public Department selectByPrimaryKey(String departmentid) {
		return departmentMapper.selectByPrimaryKey(departmentid);
	}

	@Override
	public int updateByPrimaryKey(Department record) {
		return departmentMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Department> likedepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentMapper.likedepartment(department);
	}

}
