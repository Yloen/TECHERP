package com.tech.ssm.controller.AdmissionsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Admissions;
import com.tech.ssm.service.AdmissionsService;

@Controller
@RequestMapping("/Admissions")
public class AdmissionsController {
	
	@Autowired
	private AdmissionsService admissionsservice;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<Admissions> admissionslist(Admissions admissions){
		List<Admissions> admissionslist=admissionsservice.queryAll(admissions);
		return admissionslist;	
	}
	
	
	@RequestMapping("/select_by_id")
	@ResponseBody
	public Admissions selectByPrimaryKey(String admissions_id){
		Admissions admissions=admissionsservice.selectByPrimaryKey(admissions_id);
		return admissions;	
	}
	
	
	@RequestMapping(value="/delete_id")
	@ResponseBody
	private int Delete(String admissions_id) {
		return admissionsservice.deleteByPrimaryKey(admissions_id);
		
	}
	
	@RequestMapping(value="/insert")
	@ResponseBody
	private int Insert(Admissions admissions) {
		return admissionsservice.insert(admissions);
		
	}
	
	@RequestMapping(value="/insertSelective")
	@ResponseBody
	private int InsertSelective(Admissions admissions) {
		return admissionsservice.insertSelective(admissions);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective")
	@ResponseBody
	private int updateByPrimaryKeySelective(Admissions admissions) {
		return admissionsservice.updateByPrimaryKeySelective(admissions);
		
	}
	
	@RequestMapping(value="/update_by_id")
	@ResponseBody
	private int updateById(Admissions admissions) {
		return admissionsservice.updateByPrimaryKey(admissions);
		
	}
	

}