package com.tech.ssm.controller.EmploymentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Employment;
import com.tech.ssm.service.EmploymentService;

@Controller
@RequestMapping("/Employment")
public class EmploymentController {
	
	@Autowired
	private EmploymentService employmentservice;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Employment> employmentlist(Employment employment){
		List<Employment> employmentlist=employmentservice.queryAll(employment);
		return employmentlist;	
	}
	
	
	@RequestMapping("/select_by_id")
	@ResponseBody
	public Employment selectByPrimaryKey(String employment_id){
		Employment employment=employmentservice.selectByPrimaryKey(employment_id);
		return employment;	
	}
	
	
	@RequestMapping(value="/delete_id")
	@ResponseBody
	private int Delete(String employment_id) {
		return employmentservice.deleteByPrimaryKey(employment_id);
		
	}
	
	@RequestMapping(value="/insert")
	@ResponseBody
	private int Insert(Employment employment) {
		return employmentservice.insert(employment);
		
	}
	
	@RequestMapping(value="/insertSelective")
	@ResponseBody
	private int InsertSelective(Employment employment) {
		return employmentservice.insertSelective(employment);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective")
	@ResponseBody
	private int updateByPrimaryKeySelective(Employment employment) {
		return employmentservice.updateByPrimaryKeySelective(employment);
		
	}
	
	@RequestMapping(value="/update_by_id")
	@ResponseBody
	private int updateById(Employment employment) {
		return employmentservice.updateByPrimaryKey(employment);
		
	}
	

}

