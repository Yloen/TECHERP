package com.tech.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.ssm.domain.Menu;
import com.tech.ssm.mapper.MenuMapper;
import com.tech.ssm.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menumapper;
	
	@Override
	public List<Menu> find() {
		// TODO 自动生成的方法存根
		return menumapper.find();
	}

	@Override
	public List<Menu> findRecovery() {
		// TODO 自动生成的方法存根
		return menumapper.findRecovery();
	}

	@Override
	public Menu selectByID(String MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.selectByID(MenuId);
	}

	@Override
	public int Recovery(String MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.Recovery(MenuId);
	}

	@Override
	public int Revocation(String MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.Revocation(MenuId);
	}

	@Override
	public int RecoveryBatch(String[] MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.RecoveryBatch(MenuId);
	}

	@Override
	public int deleteBatch(String[] MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.deleteBatch(MenuId);
	}

	@Override
	public int deleteByID(String MenuId) {
		// TODO 自动生成的方法存根
		return menumapper.deleteByID(MenuId);
	}

	@Override
	public List<Menu> likecontent(Menu Menu) {
		// TODO 自动生成的方法存根
		return menumapper.likecontent(Menu);
	}

	@Override
	public int insert(Menu Menu) {
		// TODO 自动生成的方法存根
		return menumapper.insert(Menu);
	}

}
