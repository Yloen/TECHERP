package com.tech.ssm.domain;


/**
 * 招生信息表
 * @author Admissions
 *
 */
public class Admissions {
	private String admissions_id;
	private String admissions_name;
	private String admissions_school;
	private String admissions_place;
	private String admissions_way;
	private String admissions_professional;

	public String getAdmissions_id() {
		return admissions_id;
	}

	public void setAdmissions_id(String admissions_id) {
		this.admissions_id = admissions_id;
	}

	public String getAdmissions_name() {
		return admissions_name;
	}

	public void setAdmissions_name(String admissions_name) {
		this.admissions_name = admissions_name;
	}

	public String getAdmissions_school() {
		return admissions_school;
	}

	public void setAdmissions_school(String admissions_school) {
		this.admissions_school = admissions_school;
	}

	public String getAdmissions_place() {
		return admissions_place;
	}

	public void setAdmissions_place(String admissions_place) {
		this.admissions_place = admissions_place;
	}

	public String getAdmissions_way() {
		return admissions_way;
	}

	public void setAdmissions_way(String admissions_way) {
		this.admissions_way = admissions_way;
	}

	public String getAdmissions_professional() {
		return admissions_professional;
	}

	public void setAdmissions_professional(String admissions_professional) {
		this.admissions_professional = admissions_professional;
	}

	@Override
	public String toString() {
		return "Admissions [admissions_id=" + admissions_id + ", admissions_name=" + admissions_name
				+ ", admissions_school=" + admissions_school + ", admissions_place=" + admissions_place
				+ ", admissions_way=" + admissions_way + ", admissions_professional=" + admissions_professional + "]";
	}

}
