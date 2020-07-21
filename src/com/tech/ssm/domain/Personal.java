package com.tech.ssm.domain;

/**
 * 个人课表
 * 
 * @author Personal
 *
 */
public class Personal {
	private String personal_student;
	private String personal_course_id;
	private String personal_course;
	private String personal_teacher;

	public String getPersonal_student() {
		return personal_student;
	}

	public void setPersonal_student(String personal_student) {
		this.personal_student = personal_student;
	}

	public String getPersonal_course_id() {
		return personal_course_id;
	}

	public void setPersonal_course_id(String personal_course_id) {
		this.personal_course_id = personal_course_id;
	}

	public String getPersonal_course() {
		return personal_course;
	}

	public void setPersonal_course(String personal_course) {
		this.personal_course = personal_course;
	}

	public String getPersonal_teacher() {
		return personal_teacher;
	}

	public void setPersonal_teacher(String personal_teacher) {
		this.personal_teacher = personal_teacher;
	}

	@Override
	public String toString() {
		return "Personal [personal_student=" + personal_student + ", personal_course_id=" + personal_course_id
				+ ", personal_course=" + personal_course + ", personal_teacher=" + personal_teacher + "]";
	}

}
