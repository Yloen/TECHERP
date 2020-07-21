package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.College;
import com.tech.ssm.domain.Squad;
import com.tech.ssm.mapper.SquadMapper;
import com.tech.ssm.service.SquadService;

@Service
public class SquadServiceImpl implements SquadService {
	@Autowired
	SquadMapper squadMapper;

	@Override
	public Squad selectByPrimaryKey(String squad_id) {

		return squadMapper.selectByPrimaryKey(squad_id);
	}

	@Override
	public int deleteByPrimaryKey(String squad_id) {

		return squadMapper.deleteByPrimaryKey(squad_id);
	}

	@Override
	public int insert(Squad squad) {

		return squadMapper.insert(squad);
	}

	@Override
	public int insertSelective(Squad squad) {

		return squadMapper.insertSelective(squad);
	}

	@Override
	public int updateByPrimaryKeySelective(Squad squad) {

		return squadMapper.updateByPrimaryKeySelective(squad);
	}

	@Override
	public int updateByPrimaryKey(Squad squad) {

		return squadMapper.updateByPrimaryKey(squad);
	}

	@Override
	public List<Squad> queryAll(Squad squad) {

		return squadMapper.queryAll(squad);
	}

}
