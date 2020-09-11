package com.tech.ssm.controller.Power;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Identity;
import com.tech.ssm.domain.User;
import com.tech.ssm.domain.UserIdentity;
import com.tech.ssm.service.RoleService;
import com.tech.ssm.service.UserService;

@Controller
@RequestMapping("/Role")
public class RoleController {
	@Autowired
	private RoleService roleService;
	@Autowired
	private UserService userservice;

	/*
	 * 现有用户展示
	 */
	@RequestMapping("/List.do")
	public String Roselist(HttpSession session) {
		/**
		 * 查询用户身份表的用户id、身份id
		 */
		List<UserIdentity> userIdentity = roleService.findUserIdentity();
		session.setAttribute("userlist", userIdentity);
		return "Role/role_list";
	}

	/*
	 * 角色名称展示
	 */
	@RequestMapping("/Role_show")
	public String RoseShow(HttpSession session, String UserId) {
		List<Identity> identity = roleService.findIdentity();
		System.out.println(identity);
		session.setAttribute("identity", identity);
		session.setAttribute("userId", UserId);
		return "Role/role_edit";
	}

	/*
	 * 角色修改
	 */
	@RequestMapping("/Role_update")
	@ResponseBody
	public int RoleUpdate(String UserId, String IdentityId) {
		return roleService.RoleUpdate(UserId, IdentityId);
	}

	// 删除多
	@RequestMapping("/Role_DeleteBatch")
	@ResponseBody
	public int deleteBatch(String[] ids) {
		return roleService.deleteBatch(ids);
	}

	// 删除
	@RequestMapping("/Role_Delete")
	@ResponseBody
	public int User(String UserId) {
		return roleService.deleteByID(UserId);
	}
}
