package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Company;
import com.tech.ssm.mapper.CompanyMapper;
import com.tech.ssm.service.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	CompanyMapper companyMapper;

	@Override
	public Company selectByPrimaryKey(String company_id) {

		return companyMapper.selectByPrimaryKey(company_id);
	}

	@Override
	public int deleteByPrimaryKey(String company_id) {

		return companyMapper.deleteByPrimaryKey(company_id);
	}

	@Override
	public int insert(Company company) {

		return companyMapper.insert(company);
	}

	@Override
	public int insertSelective(Company company) {

		return companyMapper.insertSelective(company);
	}

	@Override
	public int updateByPrimaryKeySelective(Company company) {

		return companyMapper.updateByPrimaryKeySelective(company);
	}

	@Override
	public int updateByPrimaryKey(Company company) {

		return companyMapper.updateByPrimaryKey(company);
	}

	@Override
	public List<Company> queryAll(Company company) {

		return companyMapper.queryAll(company);
	}

}
