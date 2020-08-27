package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.User;

public interface UserMapper {
	// 查询所有
	List<User> find();

	// 批量删除
	int deleteBatch(String[] ids);

	// 删除byid
	int deleteByID(String UserId);

	// 修改状态
	int changeStatus(String[] ids);

	// 根据id查
	User selectByID(String UserId);

	// 模糊查询
	List<User> likeuser(User user);

	// 增加
	int insert(User user);

	// 更新
	int updateByID(User user);
	
    //判断是否存在
	List<User> Existenceuser(User user);

}
