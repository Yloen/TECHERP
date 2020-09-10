package com.tech.ssm.service;

import java.util.List;

import com.tech.ssm.domain.Menu;

public interface MenuService {
	//查询全部
    List<Menu> find();
    
    //查询已回收全部
    List<Menu> findRecovery();
    
    // 根据id查
    Menu selectByID(String MenuId);
    
    //伪删除
    int Recovery(String MenuId);
    
    //撤销
    int Revocation(String MenuId);
    
    //伪删除(多)
    int RecoveryBatch(String[] MenuId);
    
    // 批量删除
 	int deleteBatch(String[] MenuId);

 	// 删除byid
 	int deleteByID(String MenuId);
 	
    // 模糊查询
  	List<Menu> likecontent(Menu Menu);
  	
  	//添加
 	int insert(Menu content);

}
