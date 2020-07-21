package com.tech.ssm.domain;

/**
 * 就业公司表
 * @author Company
 *
 */
public class Company {

	private String company_id;
	
	private String company_jobs;
	private String company_name;

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getCompany_jobs() {
		return company_jobs;
	}

	public void setCompany_jobs(String company_jobs) {
		this.company_jobs = company_jobs;
	}

	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_jobs=" + company_jobs + ", company_name=" + company_name
				+ "]";
	}

	

}
