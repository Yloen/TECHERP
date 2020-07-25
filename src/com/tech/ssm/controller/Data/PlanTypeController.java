package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.PlanType;
import com.tech.ssm.service.PlanTypeService;

@Controller
@RequestMapping("/PlanType")
public class PlanTypeController {
	
	@Autowired
	private PlanTypeService plantypeservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<PlanType> PlanTypelist(PlanType planType){
		List<PlanType> planTypelist=plantypeservice.queryAll(planType);
		return planTypelist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public PlanType selectByPrimaryKey(String planType_id){
		PlanType planType=plantypeservice.selectByPrimaryKey(planType_id);
		return planType;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String planType_id) {
		return plantypeservice.deleteByPrimaryKey(planType_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(PlanType planType) {
		return plantypeservice.insert(planType);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(PlanType planType) {
		return plantypeservice.insertSelective(planType);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(PlanType planType) {
		return plantypeservice.updateByPrimaryKeySelective(planType);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(PlanType planType) {
		return plantypeservice.updateByPrimaryKey(planType);
		
	}
	

}