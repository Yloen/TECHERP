package com.tech.ssm.domain;

/**
 * 学生基本信息表
 * 
 * @author Student
 *
 */
public class Student {
	private String student_id;
	private String student_name;
	private String student_grade;
	private String student_sex;
	private String student_professional;
	private String student_status;
	private String student_admissions;
	private String student_class;

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_grade() {
		return student_grade;
	}

	public void setStudent_grade(String student_grade) {
		this.student_grade = student_grade;
	}

	public String getStudent_sex() {
		return student_sex;
	}

	public void setStudent_sex(String student_sex) {
		this.student_sex = student_sex;
	}

	public String getStudent_professional() {
		return student_professional;
	}

	public void setStudent_professional(String student_professional) {
		this.student_professional = student_professional;
	}

	public String getStudent_status() {
		return student_status;
	}

	public void setStudent_status(String student_status) {
		this.student_status = student_status;
	}

	public String getStudent_admissions() {
		return student_admissions;
	}

	public void setStudent_admissions(String student_admissions) {
		this.student_admissions = student_admissions;
	}

	public String getStudent_class() {
		return student_class;
	}

	public void setStudent_class(String student_class) {
		this.student_class = student_class;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_grade="
				+ student_grade + ", student_sex=" + student_sex + ", student_professional=" + student_professional
				+ ", student_status=" + student_status + ", student_admissions=" + student_admissions
				+ ", student_class=" + student_class + "]";
	}

}
