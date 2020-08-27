package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.PersonallInfo;

public interface PersonallInfoService {
	// 查询所有
	List<PersonallInfo> findPersonallInfo();

	// 删除byid
	int deletePersonByID(String PersonalId);

	// 根据id查
	PersonallInfo selectPersonByID(String PersonalId);

	// 动态更新
	int updatePersonByID(PersonallInfo personallInfo);

	// 增加
	int insertPerson(PersonallInfo personallInfo);

	// 判断有没有
	List<PersonallInfo> Existenceuser(PersonallInfo personallInfo);

	// 批量删除
	int deletePersonBatch(String[] ids);

//模糊查询
	List<PersonallInfo> likepersonallInfo(PersonallInfo personallInfo);
}
