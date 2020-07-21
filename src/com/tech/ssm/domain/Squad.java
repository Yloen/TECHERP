package com.tech.ssm.domain;

public class Squad {
	private String squad_id;
	private String squad_teachar;
	private String squad_name;
	private Integer squad_count;

	public String getSquad_id() {
		return squad_id;
	}

	public void setSquad_id(String squad_id) {
		this.squad_id = squad_id;
	}

	public String getSquad_teachar() {
		return squad_teachar;
	}

	public void setSquad_teachar(String squad_teachar) {
		this.squad_teachar = squad_teachar;
	}

	public String getSquad_name() {
		return squad_name;
	}

	public void setSquad_name(String squad_name) {
		this.squad_name = squad_name;
	}

	public Integer getSquad_count() {
		return squad_count;
	}

	public void setSquad_count(Integer squad_count) {
		this.squad_count = squad_count;
	}

	@Override
	public String toString() {
		return "Squad [squad_id=" + squad_id + ", squad_teachar=" + squad_teachar + ", squad_name=" + squad_name
				+ ", squad_count=" + squad_count + "]";
	}

}
