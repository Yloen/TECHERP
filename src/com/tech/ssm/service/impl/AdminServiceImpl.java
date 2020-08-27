package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Admin;
import com.tech.ssm.mapper.AdminMapper;
import com.tech.ssm.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminMapper adminMapper;
	
	@Override
	public List<Admin> find() {
		return adminMapper.find();
	}

	@Override
	public int deleteByPrimaryKey(Integer adminid) {
		return adminMapper.deleteByPrimaryKey(adminid);
	}

	@Override
	public int deleteBatch(Integer[] ids) {
		return adminMapper.deleteBatch(ids);
	}

	@Override
	public int insert(Admin record) {
		record.setAdminPwd("123");
		record.setStatus(1);
		return adminMapper.insert(record);
	}

	@Override
	public Admin selectByPrimaryKey(Integer adminid) {
		return adminMapper.selectByPrimaryKey(adminid);
	}

	@Override
	public int updateByPrimaryKey(Admin record) {
		return adminMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Admin> likeadmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminMapper.likeadmin(admin);
	}

	@Override
	public int updateNewPassword(String AdminPwd) {
		// TODO Auto-generated method stub
		return adminMapper.updateNewPassword(AdminPwd);
	}

}
