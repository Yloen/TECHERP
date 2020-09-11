package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Identity;
import com.tech.ssm.domain.UserIdentity;
import com.tech.ssm.mapper.RoleMapper;
import com.tech.ssm.mapper.UserMapper;
import com.tech.ssm.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	@Autowired
	RoleMapper roleMapper;
	
	@Override
	public List<Identity> findIdentity() {
		// TODO Auto-generated method stub
		return roleMapper.findIdentity();
	}

	@Override
	public void insertRole(UserIdentity userIdentity) {
		// TODO Auto-generated method stub
		roleMapper.insertRole(userIdentity);
	}
	/**
	 * 查询用户身份表的用户id、身份id
	 */
	@Override
	public List<UserIdentity> findUserIdentity() {
		// TODO Auto-generated method stub
		return roleMapper.findUserIdentity();
	}
	
	/**
	 * 修改身份
	 */

	@Override
	public int RoleUpdate(String userId, String identityId) {
		// TODO Auto-generated method stub
		return roleMapper.RoleUpdate(userId,identityId);
	}

	@Override
	public int deleteBatch(String[] ids) {
		// TODO 自动生成的方法存根
		return roleMapper.deleteBatch(ids);
	}

	@Override
	public int deleteByID(String UserId) {
		// TODO 自动生成的方法存根
		return roleMapper.deleteByID(UserId);
	}
	

	
}
