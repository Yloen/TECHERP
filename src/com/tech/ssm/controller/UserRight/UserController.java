package com.tech.ssm.controller.UserRight;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.User;
import com.tech.ssm.service.UserService;

@Controller
@RequestMapping("/User")
public class UserController {
	@Autowired
	private UserService userservice;

	//所有
	@RequestMapping("/List.do")
	public String Userlist(HttpSession session) {
		List userlist = userservice.find();
		session.setAttribute("userlist", userlist);
		return "UserRight/user_list";
	}

	//新建界面
	@RequestMapping("/User_add")
	public String add() {
		return "UserRight/user_add";
	}

	//修改界面
	@RequestMapping("/User_edit")
	public String edit(String UserId, HttpSession session) {
		User user = userservice.selectByID(UserId);
		session.setAttribute("user", user);
		return "UserRight/user_edit";
	}

	

	//添加
	@RequestMapping(value = "/User_insert", method = RequestMethod.POST)
	@ResponseBody
	private String insert(User user) {
		if (userservice.Existenceuser(user).size() > 0) {
			return "该用户名已经存在，请更换用户名!";
		}
		int i = userservice.insert(user);
		System.out.println(i);
		return "ok";
	}

	//更新
	@RequestMapping(value = "/User_update")
	@ResponseBody
	private int update(User user) {
		return userservice.updateByID(user);
	}

	//详细界面
	@RequestMapping("/User_show")
	public String searchUserByUserId(String UserId, HttpSession session) {
		User user = userservice.selectByID(UserId);
		session.setAttribute("user", user);
		return "UserRight/user_show";
	}

	// 模糊查询
	@RequestMapping("/findlikeUser")
	@ResponseBody
	public ModelAndView findlikeUser(User user) {
		System.out.println(user);
		List<User> users = userservice.likeuser(user);
		ModelAndView data = new ModelAndView("UserRight/search_list");
		data.addObject("users", users);
		return data;
	}
	
	
	//删除
	@RequestMapping("/User_Delete")
	@ResponseBody
	public int User(String UserId) {
		return  userservice.deleteByID(UserId);
	}
	
	//批量删除
	@RequestMapping(value="/User_DeleteBatch")
	@ResponseBody
	private int deleteBatch(String[] ids) throws Exception {		
		return userservice.deleteBatch(ids);
	}

}
