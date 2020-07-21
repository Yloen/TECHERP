package com.tech.ssm.domain;

/**
 * 课程详情表
 * @author CourseDetailed
 *
 */
public class CourseDetailed {
	private String id;
	private String course_id;
	private String course_teacher;
	private Integer course_week;
	private Integer course_day;
	private Integer course_lesson;
	private String course_place;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public Integer getCourse_week() {
		return course_week;
	}
	public void setCourse_week(Integer course_week) {
		this.course_week = course_week;
	}
	public Integer getCourse_day() {
		return course_day;
	}
	public void setCourse_day(Integer course_day) {
		this.course_day = course_day;
	}
	public Integer getCourse_lesson() {
		return course_lesson;
	}
	public void setCourse_lesson(Integer course_lesson) {
		this.course_lesson = course_lesson;
	}
	public String getCourse_place() {
		return course_place;
	}
	public void setCourse_place(String course_place) {
		this.course_place = course_place;
	}
	@Override
	public String toString() {
		return "CourseDetailed [id=" + id + ", course_id=" + course_id + ", course_teacher=" + course_teacher
				+ ", course_week=" + course_week + ", course_day=" + course_day + ", course_lesson=" + course_lesson
				+ ", course_place=" + course_place + "]";
	}
	
	
}
