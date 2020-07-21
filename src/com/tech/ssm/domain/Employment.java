package com.tech.ssm.domain;

/**
 * 就业申请表
 * @author Employment
 *
 */
public class Employment {
	private String employment_id;
	private String employment_name;
	private String employment_company;
	private String employment_jobs;
	private String employment_student;

	public String getEmployment_id() {
		return employment_id;
	}

	public void setEmployment_id(String employment_id) {
		this.employment_id = employment_id;
	}

	public String getEmployment_name() {
		return employment_name;
	}

	public void setEmployment_name(String employment_name) {
		this.employment_name = employment_name;
	}

	public String getEmployment_company() {
		return employment_company;
	}

	public void setEmployment_company(String employment_company) {
		this.employment_company = employment_company;
	}

	public String getEmployment_jobs() {
		return employment_jobs;
	}

	public void setEmployment_jobs(String employment_jobs) {
		this.employment_jobs = employment_jobs;
	}

	public String getEmployment_student() {
		return employment_student;
	}

	public void setEmployment_student(String employment_student) {
		this.employment_student = employment_student;
	}

	@Override
	public String toString() {
		return "Employment [employment_id=" + employment_id + ", employment_name=" + employment_name
				+ ", employment_company=" + employment_company + ", employment_jobs=" + employment_jobs
				+ ", employment_student=" + employment_student + "]";
	}

}
