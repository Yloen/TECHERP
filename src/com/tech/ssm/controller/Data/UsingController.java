package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Using;
import com.tech.ssm.service.UsingService;

@Controller
@RequestMapping("/Using")
public class UsingController { 
	
	@Autowired
	private UsingService usingservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Using> Usinglist(Using using){
		List<Using> Usinglist=usingservice.queryAll(using);
		return Usinglist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Using selectByPrimaryKey(String using_id){
		Using Using=usingservice.selectByPrimaryKey(using_id);
		return Using;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String using_id) {
		return usingservice.deleteByPrimaryKey(using_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Using using) {
		return usingservice.insert(using);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Using using) {
		return usingservice.insertSelective(using);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Using using) {
		return usingservice.updateByPrimaryKeySelective(using);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Using using) {
		return usingservice.updateByPrimaryKey(using);
		
	}
	


}
