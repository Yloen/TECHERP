package com.tech.ssm.domain;

/**
 * 学生成绩表
 * @author Results
 *
 */
public class Results {
	private String results_student;
	private String results_course;
	private Integer results_credits;
	private Float result_score;

	public String getResults_student() {
		return results_student;
	}

	public void setResults_student(String results_student) {
		this.results_student = results_student;
	}

	public String getResults_course() {
		return results_course;
	}

	public void setResults_course(String results_course) {
		this.results_course = results_course;
	}

	public Integer getResults_credits() {
		return results_credits;
	}

	public void setResults_credits(Integer results_credits) {
		this.results_credits = results_credits;
	}

	public Float getResult_score() {
		return result_score;
	}

	public void setResult_score(Float result_score) {
		this.result_score = result_score;
	}

	@Override
	public String toString() {
		return "Results [results_student=" + results_student + ", results_course=" + results_course
				+ ", results_credits=" + results_credits + ", result_score=" + result_score + "]";
	}

}
