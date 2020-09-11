package com.tech.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tech.ssm.domain.Identity;
import com.tech.ssm.domain.UserIdentity;

public interface RoleMapper {
	/*
	 * 查询所有角色
	 */
	List<Identity> findIdentity();

	/*
	 * 给用户添加身份
	 */
	void insertRole(UserIdentity userIdentity);

	/**
	 * 查询用户身份表的用户id、身份id
	 */
	List<UserIdentity> findUserIdentity();

	int RoleUpdate(@Param("userId") String userId, @Param("identityId") String identityId);

	// 批量删除
	int deleteBatch(String[] ids);

	// 删除byid
	int deleteByID(String UserId);

}
