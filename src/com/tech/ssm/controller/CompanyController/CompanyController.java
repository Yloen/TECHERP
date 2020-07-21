package com.tech.ssm.controller.CompanyController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Company;
import com.tech.ssm.service.CompanyService;

@Controller
@RequestMapping("/Company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Company> companylist(Company company){
		List<Company> companylist=companyservice.queryAll(company);
		return companylist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Company selectByPrimaryKey(String company_id){
		Company company=companyservice.selectByPrimaryKey(company_id);
		return company;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String company_id) {
		return companyservice.deleteByPrimaryKey(company_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Company company) {
		return companyservice.insert(company);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Company company) {
		return companyservice.insertSelective(company);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Company company) {
		return companyservice.updateByPrimaryKeySelective(company);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Company company) {
		return companyservice.updateByPrimaryKey(company);
		
	}
	

}
