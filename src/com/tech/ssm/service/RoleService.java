package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Identity;
import com.tech.ssm.domain.UserIdentity;

public interface RoleService {
	/*
	 * 查询角色
	 */
	List<Identity> findIdentity();
	
	/**
	 * 给用户添加身份
	 * @param userIdentity
	 */
	void insertRole(UserIdentity userIdentity);
	
	/**
	 * 查询用户身份表的用户id、身份id
	 * @return
	 */
	List<UserIdentity> findUserIdentity();
	
	/**
	 * 修改身份
	 * @param userId
	 * @param identityId
	 * @return
	 */
	int RoleUpdate(String userId, String identityId);
}
