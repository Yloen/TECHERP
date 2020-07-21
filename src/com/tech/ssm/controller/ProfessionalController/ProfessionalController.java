package com.tech.ssm.controller.ProfessionalController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Professional;
import com.tech.ssm.service.ProfessionalService;

@Controller
@RequestMapping("/Professional")
public class ProfessionalController {
	
	@Autowired
	private ProfessionalService professionalservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Professional> Professionallist(Professional professional){
		List<Professional> professionallist=professionalservice.queryAll(professional);
		return professionallist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Professional selectByPrimaryKey(String professional_id){
		Professional professional=professionalservice.selectByPrimaryKey(professional_id);
		return professional;	
	}
	
	
	@RequestMapping(value="/delete_id")
	@ResponseBody
	private int Delete(String professional_id) {
		return professionalservice.deleteByPrimaryKey(professional_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Professional professional) {
		return professionalservice.insert(professional);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Professional professional) {
		return professionalservice.insertSelective(professional);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Professional professional) {
		return professionalservice.updateByPrimaryKeySelective(professional);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Professional professional) {
		return professionalservice.updateByPrimaryKey(professional);
		
	}
	

}
