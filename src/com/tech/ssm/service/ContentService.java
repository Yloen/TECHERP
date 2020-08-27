package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Content;
import com.tech.ssm.domain.User;

public interface ContentService {
	//查询全部
    List<Content> find();
    
    //查询已回收全部
    List<Content> findRecovery();
    
    // 根据id查
    Content selectByID(String ContentId);
    
    //伪删除
    int Recovery(String ContentId);
    
    //伪删除(多)
    int RecoveryBatch(String[] ContentId);
    
    // 批量删除
 	int deleteBatch(String[] ids);

 	// 删除byid
 	int deleteByID(String ContentId);
 	
 	 //撤销
    int Revocation(String ContentId);
    
    // 模糊查询
   	List<Content> likecontent(Content Content);
   	
  //添加
   	int insert(Content content);
}
