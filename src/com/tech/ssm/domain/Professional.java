package com.tech.ssm.domain;

/**
 * 专业基本信息表
 * @author Professional
 *
 */
public class Professional {
	private String professional_id;
	private String professional_name;
	private String professional_college;
	public String getProfessional_id() {
		return professional_id;
	}
	public void setProfessional_id(String professional_id) {
		this.professional_id = professional_id;
	}
	public String getProfessional_name() {
		return professional_name;
	}
	public void setProfessional_name(String professional_name) {
		this.professional_name = professional_name;
	}
	public String getProfessional_college() {
		return professional_college;
	}
	public void setProfessional_college(String professional_college) {
		this.professional_college = professional_college;
	}
	@Override
	public String toString() {
		return "Professional [professional_id=" + professional_id + ", professional_name=" + professional_name
				+ ", professional_college=" + professional_college + "]";
	}

	
}
