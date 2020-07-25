package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Plan;
import com.tech.ssm.service.PlanService;

@Controller
@RequestMapping("/Plan")
public class PlanController {
	
	@Autowired
	private PlanService planservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Plan> planlist(Plan plan){
		List<Plan> planlist=planservice.queryAll(plan);
		return planlist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Plan selectByPrimaryKey(String plan_id){
		Plan plan=planservice.selectByPrimaryKey(plan_id);
		return plan;	
	}
	
	
	@RequestMapping(value="/delete_id")
	@ResponseBody
	private int Delete(String plan_id) {
		return planservice.deleteByPrimaryKey(plan_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Plan plan) {
		return planservice.insert(plan);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Plan plan) {
		return planservice.insertSelective(plan);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Plan plan) {
		return planservice.updateByPrimaryKeySelective(plan);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Plan plan) {
		return planservice.updateByPrimaryKey(plan);
		
	}
	

}

