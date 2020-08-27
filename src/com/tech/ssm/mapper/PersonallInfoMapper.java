package com.tech.ssm.mapper;

import java.util.List;

import com.tech.ssm.domain.PersonallInfo;
import com.tech.ssm.domain.User;

public interface PersonallInfoMapper {
	// 查询所有
	List<PersonallInfo> findPersonallInfo();
	// 批量删除
	int deletePersonBatch(String[] ids);
	// 删除
	int deletePersonByID(String PersonalId);
	// 模糊查询
	List<PersonallInfo> likepersonallInfo(PersonallInfo personallInfo);
	// 根据id查
	PersonallInfo selectPersonByID(String PersonalId);

	// 增加
	int insertPerson(PersonallInfo personallInfo);

	// 动态修改
	int updatePersonByID(PersonallInfo personallInfo);

	// 判断是否存在
	List<PersonallInfo> Existenceuser(PersonallInfo personallInfo);
}
