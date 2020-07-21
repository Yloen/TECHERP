package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Results;
import com.tech.ssm.mapper.ResultsMapper;
import com.tech.ssm.service.ResultsService;

@Service
public class ResultsServiceImpl implements ResultsService {
	@Autowired
	ResultsMapper resultsMapper;

	@Override
	public Results selectByPrimaryKey(String results_id) {

		return resultsMapper.selectByPrimaryKey(results_id);
	}

	@Override
	public int deleteByPrimaryKey(String results_id) {

		return resultsMapper.deleteByPrimaryKey(results_id);
	}

	@Override
	public int insert(Results results) {

		return resultsMapper.insert(results);
	}

	@Override
	public int insertSelective(Results results) {

		return resultsMapper.insertSelective(results);
	}

	@Override
	public int updateByPrimaryKeySelective(Results results) {

		return resultsMapper.updateByPrimaryKeySelective(results);
	}

	@Override
	public int updateByPrimaryKey(Results results) {

		return resultsMapper.updateByPrimaryKey(results);
	}

	@Override
	public List<Results> queryAll(Results results) {

		return resultsMapper.queryAll(results);
	}

}
