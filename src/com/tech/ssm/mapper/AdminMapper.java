package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.Admin;



public interface AdminMapper {
	//查询全部
    List<Admin> find();
	//根据主键删除
    int deleteByPrimaryKey(Integer adminid);
    //批量删除
    int deleteBatch(Integer[] ids);
    //添加数据
    int insert(Admin record);
    //根据主键查询
    Admin selectByPrimaryKey(Integer adminid);
    //根据主键修改数据
    int updateByPrimaryKey(Admin record);
    //修改密码
    int updateNewPassword(String AdminPwd);
    //模糊查询
    List<Admin> likeadmin(Admin admin);
}