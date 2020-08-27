package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.User;
import com.tech.ssm.mapper.UserMapper;
import com.tech.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserMapper userMapper;

	@Override
	public List<User> find() {
		return userMapper.find();
	}

	@Override
	public int deleteBatch(String[] ids) {
		return userMapper.deleteBatch(ids);
	}

	@Override
	public int deleteByID(String UserId) {
		return userMapper.deleteByID(UserId);
	}

	@Override
	public int changeStatus(String[] ids) {
		return userMapper.changeStatus(ids);
	}

	@Override
	public User selectByID(String UserId) {
		return userMapper.selectByID(UserId);
	}

	@Override
	public List<User> likeuser(User user) {
		return userMapper.likeuser(user);
	}

	@Override
	public int insert(User user) {
		return userMapper.insert(user);
	}

	@Override
	public int updateByID(User user) {
		return userMapper.updateByID(user);
	}

	@Override
	public List<User> Existenceuser(User user) {
		return userMapper.Existenceuser(user);
	}
	
	
}
