package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Using;

public interface UsingService {

	Using selectByPrimaryKey(String using_id);

	int deleteByPrimaryKey(String using_id);

	int insert(Using using);

	int insertSelective(Using using);

	int updateByPrimaryKeySelective(Using using);

	int updateByPrimaryKey(Using Using);

	List<Using> queryAll(Using using);

}
