package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Personal;
import com.tech.ssm.service.PersonalService;

@Controller
@RequestMapping("/Personal")
public class PerssonalController {
	
	@Autowired
	private PersonalService personalservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Personal> personallist(Personal personal){
		List<Personal> personallist=personalservice.queryAll(personal);
		return personallist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Personal selectByPrimaryKey(String personal_id){
		Personal personal=personalservice.selectByPrimaryKey(personal_id);
		return personal;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String personal_id) {
		return personalservice.deleteByPrimaryKey(personal_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Personal personal) {
		return personalservice.insert(personal);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Personal personal) {
		return personalservice.insertSelective(personal);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Personal personal) {
		return personalservice.updateByPrimaryKeySelective(personal);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Personal personal) {
		return personalservice.updateByPrimaryKey(personal);
		
	}
	

}
