package com.tech.ssm.domain;

public class Department {
	private String DepartmentId;
	private String DepartmentName;
	private String Leader;
	private String Content;
	private String Fid;

	public String getDepartmentId() {
		return DepartmentId;
	}

	public void setDepartmentId(String departmentId) {
		DepartmentId = departmentId;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getLeader() {
		return Leader;
	}

	public void setLeader(String leader) {
		Leader = leader;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public String getFid() {
		return Fid;
	}

	public void setFid(String fid) {
		Fid = fid;
	}

}