package com.tech.ssm.domain;

public class WorkflowRecord {
	private String record_id;
	private String record_state;
	private String boom_id;
	private String auditor;
	public String getRecord_id() {
		return record_id;
	}
	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}
	public String getRecord_state() {
		return record_state;
	}
	public void setRecord_state(String record_state) {
		this.record_state = record_state;
	}
	public String getBoom_id() {
		return boom_id;
	}
	public void setBoom_id(String boom_id) {
		this.boom_id = boom_id;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	@Override
	public String toString() {
		return "WorkflowRecord [record_id=" + record_id + ", record_state=" + record_state + ", boom_id=" + boom_id
				+ ", auditor=" + auditor + "]";
	}
	

}
