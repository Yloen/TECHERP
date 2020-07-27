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
	private String teacher_position;
	private String teacher_phone;
	private String teacher_department;

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

	public String getTeacher_position() {
		return teacher_position;
	}

	public void setTeacher_position(String teacher_position) {
		this.teacher_position = teacher_position;
	}

	public String getTeacher_phone() {
		return teacher_phone;
	}

	public void setTeacher_phone(String teacher_phone) {
		this.teacher_phone = teacher_phone;
	}

	public String getTeacher_department() {
		return teacher_department;
	}

	public void setTeacher_department(String teacher_department) {
		this.teacher_department = teacher_department;
	}

	@Override
	public String toString() {
		return "teacher [teacher_id=" + teacher_id + ", teacher_name=" + teacher_name + ", teacher_sex=" + teacher_sex
				+ ", teacher_position=" + teacher_position + ", teacher_phone=" + teacher_phone + ", teacher_department="
				+ teacher_department + "]";
	}

}
