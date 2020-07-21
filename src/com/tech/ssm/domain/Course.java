package com.tech.ssm.domain;

/**
 * 课程基本表
 * @author Administrator
 *
 */
public class Course {
	private String course_id;
	private String course_teacher;
	private String course_name;
	private String course_type;
	private Integer course_credits;
	


	public String getCourse_id() {
		return course_id;
	}

	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}

	public String getCourse_teacher() {
		return course_teacher;
	}

	public void setCourse_teacher(String course_teacher) {
		this.course_teacher = course_teacher;
	}

	public Integer getCourse_credits() {
		return course_credits;
	}

	public void setCourse_credits(Integer course_credits) {
		this.course_credits = course_credits;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public String getCourse_type() {
		return course_type;
	}

	public void setCourse_type(String course_type) {
		this.course_type = course_type;
	}

	@Override
	public String toString() {
		return "Course [course_id=" + course_id  + ", course_teacher="
				+ course_teacher + ", course_name=" + course_name + ", course_type=" + course_type + ", course_credits="
				+ course_credits + "]";
	}

	

	

}
