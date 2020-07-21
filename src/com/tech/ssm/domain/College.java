package com.tech.ssm.domain;

/**
 * 学院基本信息表
 * @author College
 *
 */
public class College {
	private String college_id;
	private String college_name;

	public String getCollege_id() {
		return college_id;
	}

	public void setCollege_id(String college_id) {
		this.college_id = college_id;
	}

	public String getCollege_name() {
		return college_name;
	}

	public void setCollege_name(String college_name) {
		this.college_name = college_name;
	}

	@Override
	public String toString() {
		return "college [college_id=" + college_id + ", college_name=" + college_name + "]";
	}

}
