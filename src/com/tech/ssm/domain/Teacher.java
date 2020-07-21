package com.tech.ssm.domain;

/**
 * 教师基本信息表
 * @author Teacher
 *
 */
public class Teacher {
	private String teacher_id;
	private String teacher_name;
	private String teacher_sex;
	private String teacher_title;
	private String teacher_phone;
	private String teacher_college;

	public String getTeacher_id() {
		return teacher_id;
	}

	public void setTeacher_id(String teacher_id) {
		this.teacher_id = teacher_id;
	}

	public String getTeacher_name() {
		return teacher_name;
	}

	public void setTeacher_name(String teacher_name) {
		this.teacher_name = teacher_name;
	}

	public String getTeacher_sex() {
		return teacher_sex;
	}

	public void setTeacher_sex(String teacher_sex) {
		this.teacher_sex = teacher_sex;
	}

	public String getTeacher_title() {
		return teacher_title;
	}

	public void setTeacher_title(String teacher_title) {
		this.teacher_title = teacher_title;
	}

	public String getTeacher_phone() {
		return teacher_phone;
	}

	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}

	public String getTeacher_college() {
		return teacher_college;
	}

	public void setTeacher_college(String teacher_college) {
		this.teacher_college = teacher_college;
	}

	@Override
	public String toString() {
		return "teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_sex=" + teacher_sex
				+ ", teacher_title=" + teacher_title + ", teacher_phone=" + teacher_phone + ", teacher_college="
				+ teacher_college + "]";
	}

}
