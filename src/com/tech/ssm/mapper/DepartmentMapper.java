package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Department;



public interface DepartmentMapper {
	//查询全部
    List<Department> find();
	//根据主键删除
    int deleteByPrimaryKey(String departmentid);
    //批量删除
    int deleteBatch(String[] ids);
    //添加数据
    int insert(Department record);
    //根据主键查询
    Department selectByPrimaryKey(String departmentid);
    //根据主键修改数据
    int updateByPrimaryKey(Department record);
    //模糊查询
    List<Department> likedepartment(Department department);
}