package com.tech.ssm.controller.UserRight;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.PersonallInfo;

import com.tech.ssm.service.PersonallInfoService;

@Controller
@RequestMapping("/PersonallInfo")
public class PersonallInfoController {
	@Autowired
	private PersonallInfoService personallInfoservice;

	// 查询所有信息
	@RequestMapping("/List.do")
	public String PersonallInfolist(HttpSession session) {
		List personallInfolist = personallInfoservice.findPersonallInfo();
		session.setAttribute("personallInfolist", personallInfolist);
		return "PersonallInfo/personallInfo_list";
	}

	// 批量删除
	@RequestMapping(value = "/Person_DeleteBatch")
	@ResponseBody
	private int deletePersonallInfoBatch(String[] ids) throws Exception {
		System.out.println("批量删除");
		System.out.println(personallInfoservice.deletePersonBatch(ids));
		return personallInfoservice.deletePersonBatch(ids);
	}

	// 模糊查询
	@RequestMapping("/Person_FindLike")
	@ResponseBody
	public ModelAndView findlikePersonallInfo(PersonallInfo personallInfo) {
		System.out.println(personallInfo);
		List<PersonallInfo> personallInfos = personallInfoservice.likepersonallInfo(personallInfo);
		ModelAndView data = new ModelAndView("PersonallInfo/search_list");
		data.addObject("personallInfos", personallInfos);
		return data;
	}

	// 根据用户id删除信息
	@RequestMapping("/Person_Delete")
	@ResponseBody
	public int PersonallInfo(String PersonalId) {
		System.out.println("根据id删除");
		System.out.println(personallInfoservice.deletePersonByID(PersonalId));
		return personallInfoservice.deletePersonByID(PersonalId);
	}

	// 根据id查询信息
	@RequestMapping("/Person_Show")
	public String searchPersonByUserId(String PersonalId, HttpSession session) {
		PersonallInfo personallInfo = personallInfoservice.selectPersonByID(PersonalId);
		session.setAttribute("personallInfo", personallInfo);
		return "PersonallInfo/personallInfo_show";
	}

	// 动态修改用户信息
	@RequestMapping(value = "/Person_Update")
	@ResponseBody
	private int update(PersonallInfo personallInfo) {
		return personallInfoservice.updatePersonByID(personallInfo);
	}

	// 添加
	@RequestMapping(value = "/Person_Insert", method = RequestMethod.POST)
	@ResponseBody
	private String insertPerson(PersonallInfo personallInfo, HttpSession session) {
		if (personallInfoservice.Existenceuser(personallInfo).size() > 0) {
			return "The user is hava,don^t add!";
		}
		int i = personallInfoservice.insertPerson(personallInfo);
		PersonallInfo person = personallInfoservice.selectPersonByID(personallInfo.getPersonalId());
		session.setAttribute("person", person);
		System.out.println(i);
		return "ok";
	}

	@RequestMapping("/Person_Add")
	public String add() {
		return "PersonallInfo/personallInfo_add";
	}

	@RequestMapping("/Person_Img")
	public String Add_Img(PersonallInfo personallInfo, HttpSession session) {
		PersonallInfo person = personallInfoservice.selectPersonByID(personallInfo.getPersonalId());
		session.setAttribute("person", person);
		return "PersonallInfo/personallInfo_img";
	}

	@RequestMapping("/Person_Edit")
	public String edit(String PersonalId, HttpSession session) {
		PersonallInfo person = personallInfoservice.selectPersonByID(PersonalId);
		session.setAttribute("person", person);
		return "PersonallInfo/personallInfo_edit";
	}
}
