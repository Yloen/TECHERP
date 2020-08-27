package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.PersonallInfo;
import com.tech.ssm.mapper.PersonallInfoMapper;

import com.tech.ssm.service.PersonallInfoService;
@Service
public class PersonallInfoServiceImpl implements PersonallInfoService{
	@Autowired
	PersonallInfoMapper personallInfoMapper;
	@Override
	public List<PersonallInfo> findPersonallInfo() {
		// TODO Auto-generated method stub
		return personallInfoMapper.findPersonallInfo();
	}
	@Override
	public int deletePersonByID(String PersonalId) {
		// TODO Auto-generated method stub
		return personallInfoMapper.deletePersonByID(PersonalId);
	}
	@Override
	public PersonallInfo selectPersonByID(String PersonalId) {
		// TODO Auto-generated method stub
		return personallInfoMapper.selectPersonByID(PersonalId);
	}
	@Override
	public int updatePersonByID(PersonallInfo personallInfo) {
		// TODO Auto-generated method stub
		return personallInfoMapper.updatePersonByID(personallInfo);
	}
	@Override
	public int insertPerson(PersonallInfo personallInfo) {
		// TODO Auto-generated method stub
		return personallInfoMapper.insertPerson(personallInfo);
	}
	@Override
	public List<PersonallInfo> Existenceuser(PersonallInfo personallInfo) {
		// TODO Auto-generated method stub
		return personallInfoMapper.Existenceuser(personallInfo);
	}
	@Override
	public int deletePersonBatch(String[] ids) {
		// TODO Auto-generated method stub
		return personallInfoMapper.deletePersonBatch(ids);
	}
	@Override
	public List<PersonallInfo> likepersonallInfo(PersonallInfo personallInfo) {
		// TODO Auto-generated method stub
		return personallInfoMapper.likepersonallInfo(personallInfo);
	}

}
